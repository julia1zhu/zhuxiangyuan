package com.myapplication.foodOrderSystem.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.myapplication.foodOrderSystem.dao.*;
import com.myapplication.foodOrderSystem.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @author 朱香原
 */
@RestController
@RequestMapping("/api/customer")
public class OrderController {
    private static int queueId;

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private MenuDao menuDao;

    @Autowired
    private GiftDao giftDao;

    @Autowired
    private ConsumeDao consumeDao;

    @Autowired
    private MembershipDao membershipDao;

    private List<FoodInfo> foodInfos = new LinkedList<>();

    /**
     * 向菜单表中增加菜品以及相关参数
     * 功能描述：bean对象传参
     * 注意：1、注意需要指定http头为 content-type为application/json
     * 2、使用body传输数据
     *
     * @param
     * @return
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date date;
    @PostMapping("/memberOrder")
    public Object memberAdd(@RequestBody FoodInfoList foodInfoList) {
        String giftName;
        int giftLength;
        int length = foodInfoList.getFoodNameList().size();
        Integer memberId = foodInfoList.getMemberId();
        date = new Date();
        for (int i = 0; i < length; i++) {
            String name = foodInfoList.getFoodNameList().get(i);
            Integer copies = foodInfoList.getFoodCopies().get(i);
            //如果点的菜在数据库中的份数并不多的话，就不能点单
            if (menuDao.copiesFindByName(name) < 0) {
                continue;
            }
            //将点的每一个菜里面加到菜品详情列表中
            foodInfos.add(new FoodInfo(name, copies));
            //点完一个菜，相应的菜单每日供应量应该减少
            menuDao.updateCopies((menuDao.copiesFindByName(name) - copies), name);

            //将点的菜品消费量，和单个菜品消费收入更新到菜品消费的数据表中去
            consumeDao.insert(name, copies, foodInfos.get(i).getSubTotal() * membershipDao.discountFindById(memberId), date);
        }

        double totalAmount = 0;
        String foodInfo = "";

        for (FoodInfo info : foodInfos) {
            totalAmount += info.getSubTotal();
            foodInfo += info;
        }

        if (totalAmount > 100) {
            giftLength = giftDao.count();
            for (int i = 0; i < giftLength; i++) {
                giftName = giftDao.findAll().get(i).getName();
                if (menuDao.copiesFindByName(giftName) > 0) {
                    //这个菜就作为赠品
                    FoodInfo foodInfo1 = new FoodInfo(giftName, 1);
                    foodInfo1.setFoodName(giftName + "(赠)");
                    foodInfo1.setSubTotal(0.0);
                    //送了一个菜，相应的菜单每日供应量应该减少
                    menuDao.updateCopies((menuDao.copiesFindByName(giftName) - 1), giftName);
                    //将点的菜品消费量，和单个菜品消费收入更新到菜品消费的数据表中去
                    consumeDao.insert(giftName + "(赠)", 1, 0.0, date);
                    foodInfo += foodInfo1;
                    break;
                }
            }
            Order order = new Order(queueId++, memberId, totalAmount, foodInfo);
            orderDao.insert(order);
            foodInfos.clear();
            return JsonData.buildSuccess(order);
        } else {
            Order order = new Order(queueId++, memberId, totalAmount, foodInfo);
            orderDao.insert(order);
            foodInfos.clear();
            return JsonData.buildSuccess(order);
        }

    }


    /**
     * 非会员进行点单操作
     * @param foodInfoList
     * @return
     */
    @PostMapping("/order")
    public Object add(@RequestBody FoodInfoList foodInfoList) {
        String giftName;
        int giftLength;
        int length = foodInfoList.getFoodNameList().size();
        date = new Date();
        for (int i = 0; i < length; i++) {
            String name = foodInfoList.getFoodNameList().get(i);
            Integer copies = foodInfoList.getFoodCopies().get(i);
            //如果点的菜在数据库中的份数并不多的话，就不能点单
            if (menuDao.copiesFindByName(name) < 0) {
                continue;
            }
            //将点的每一个菜里面加到菜品详情列表中
            foodInfos.add(new FoodInfo(name, copies));
            //点完一个菜，相应的菜单每日供应量应该减少
            menuDao.updateCopies((menuDao.copiesFindByName(name) - copies), name);

            //将点的菜品消费量，和单个菜品消费收入更新到菜品消费的数据表中去
            consumeDao.insert(name, copies, foodInfos.get(i).getSubTotal(), date);
        }

        double totalAmount = 0;
        String foodInfo = "";

        for (FoodInfo info : foodInfos) {
            totalAmount += info.getSubTotal();
            foodInfo += info;
        }

        if (totalAmount > 100) {
            giftLength = giftDao.count();
            for (int i = 0; i < giftLength; i++) {
                giftName = giftDao.findAll().get(i).getName();
                if (menuDao.copiesFindByName(giftName) > 0) {
                    FoodInfo foodInfo1 = new FoodInfo(giftName, 1);
                    foodInfo1.setFoodName(giftName + "(赠)");
                    foodInfo1.setSubTotal(0.0);
                    //送了一个菜，相应的菜单每日供应量应该减少
                    menuDao.updateCopies((menuDao.copiesFindByName(giftName) - 1), giftName);
                    //将点的菜品消费量，和单个菜品消费收入更新到菜品消费的数据表中去
                    consumeDao.insert(giftName + "(赠)", 1, 0.0, date);
                    foodInfo += foodInfo1;
                    break;
                }
            }
            Order order = new Order(queueId++, totalAmount, foodInfo);
            orderDao.insert(order);
            foodInfos.clear();
            return JsonData.buildSuccess(order);
        } else {
            Order order = new Order(queueId++, totalAmount, foodInfo);
            orderDao.insert(order);
            foodInfos.clear();
            return JsonData.buildSuccess(order);
        }

    }

}