package com.myapplication.foodOrderSystem.controller;

import com.myapplication.foodOrderSystem.dao.ConsumeDao;
import com.myapplication.foodOrderSystem.dao.OrderDao;
import com.myapplication.foodOrderSystem.domain.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;

/**
 * @author 朱香原
 */
@RestController
@RequestMapping("api/manager")
public class CountContoller {
    @Autowired
    private OrderDao orderDao;

    @Autowired
    private ConsumeDao consumeDao;


    //统计每天每单的等待时间（支持排序）、平均等待时间
    @GetMapping("/countWaitingTime")
    public Object countWaitingTime() {
        return JsonData.buildSuccess(orderDao.countWaitingTime());
    }

    //6>获取近期的爆款菜品（近5天被点份数数最多的菜品
    @GetMapping("/favorite")
    public Object count(){
        return JsonData.buildSuccess(consumeDao.count());
    }

    // 4>统计每个菜品的消费量和实际营收金额（支持按营收和被消费的份数进行排序——支持正序和倒序）
    @GetMapping("/orderByConsumption")
    public Object orderByConsumption() {
        return JsonData.buildSuccess(consumeDao.orderByConsumption());
    }

    @GetMapping("/orderByConsumptionDesc")
    public Object orderByConsumptionDesc() {
        return JsonData.buildSuccess(consumeDao.orderByConsumptionDesc());
    }

    @GetMapping("/orderByFoodRevenueDesc")
    public Object orderByFoodRevenueDesc() {
        return JsonData.buildSuccess(consumeDao.orderByFoodRevenueDesc());
    }

    @GetMapping("/orderByFoodRevenue")
    public Object orderByFoodRevenue() {
        return JsonData.buildSuccess(consumeDao.orderByFoodRevenue());
    }

    /**
     统计每天总折扣金额（“每天”可通过设置系统时间进行模拟）
     * @param request
     * @return
     */
    @GetMapping("/countDiscountlRevenue")
    public Object countDiscountlRevenue(HttpServletRequest request){
        Integer day = Integer.parseInt(request.getParameter("day"));
        Integer month = Integer.parseInt(request.getParameter("month"));
        return JsonData.buildSuccess(orderDao.countDiscountlRevenue(day,month));
    }

    /**
     *统计每天总营收金额（“每天”可通过设置系统时间进行模拟）
     * @param request
     * @return
     */
    @GetMapping("/countTotalRevenue")
    public Object count(HttpServletRequest request){
        Integer day = Integer.parseInt(request.getParameter("day"));
        Integer month = Integer.parseInt(request.getParameter("month"));
        return JsonData.buildSuccess(orderDao.countTotalRevenue(day,month));
    }

    /**
     *统计每天单量（“每天”可通过设置系统时间进行模拟）
     * @param request
     * @return
     */
    @GetMapping("/countOrders")
    public Object countOrders(HttpServletRequest request){
        Integer day = Integer.parseInt(request.getParameter("day"));
        Integer month = Integer.parseInt(request.getParameter("month"));
        return JsonData.buildSuccess(orderDao.countOrdersAmount(day,month));
    }


    //统计每天的赠品详情
    @GetMapping("/getGiftInfo")
    public Object getGiftInfo(){
        return JsonData.buildSuccess(consumeDao.findGift());
    }

}
