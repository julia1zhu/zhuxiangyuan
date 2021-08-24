package com.myapplication.foodOrderSystem.controller;

import com.myapplication.foodOrderSystem.dao.GiftDao;
import com.myapplication.foodOrderSystem.dao.MenuDao;
import com.myapplication.foodOrderSystem.domain.JsonData;
import com.myapplication.foodOrderSystem.domain.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 朱香原
 */
@RestController
@RequestMapping("/api/manager")
public class MaintainController {
    private Map<String, Object> params = new HashMap<>();

    @Autowired
    private MenuDao menuDao;

    @Autowired
    private GiftDao giftDao;

    /**
     * 管理员向菜单表中增加菜品以及相关参数
     * @param
     * @return
     */
    @PostMapping("/addMenuInfo")
    public Object addMenuInfo(@RequestBody Menu menu) {
        menuDao.insert(menu);
        return JsonData.buildSuccess(menu);
    }

    /**
     * 管理员设置赠品信息（输入赠品名字）
     * @param request
     * @return
     */
    @PostMapping("/setGift")
    public Object setGift(HttpServletRequest request){
        String name = request.getParameter("name");
        return JsonData.buildSuccess(giftDao.insert(name));
    }

    /**
     * 每天都有优惠打折的菜品，管理员可以随时设置
     * @param request
     * @return
     */
    @PostMapping("/updatePrice")
    public Object updatePrice(HttpServletRequest request){
        String name = request.getParameter("name");
        Double originalPrice = Double.parseDouble(request.getParameter("originalPrice"));
        Double discount = Double.parseDouble(request.getParameter("discount"));
        Double price = originalPrice * discount;
        menuDao.updatePrice(price,name);
        return JsonData.buildSuccess();
    }
}
