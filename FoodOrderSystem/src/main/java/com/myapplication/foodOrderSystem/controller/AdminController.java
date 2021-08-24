package com.myapplication.foodOrderSystem.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.myapplication.foodOrderSystem.dao.*;
import com.myapplication.foodOrderSystem.domain.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @author 朱香原
 */

@RestController
@RequestMapping("/api/manager")
public class AdminController {

    @Autowired
    private OrderDao orderDao;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    Date endTime;
    /**
     * 将订单里面的状态改成已完成，并输入完成时间
     * @param request
     * @return
     */
    @PutMapping("/updateState")
    public Object updateState(HttpServletRequest request) {
        Integer id = Integer.parseInt(request.getParameter("id"));
        String state = "已完成";
        endTime = new Date();
        orderDao.updateOrderState(state, endTime, id);
        return JsonData.buildSuccess();
    }

    /**
     * 查看所有订单信息
     * @return
     */
    @GetMapping("/findAllOrders")
    public Object findAllOrders(){
        return JsonData.buildSuccess(orderDao.findAllOrders());
    }

    /**
     * 根据排队序号查找订单信息
     * @return
     */
    @GetMapping("/orderFindByQueueId")
    public Object orderFindByQueueId(HttpServletRequest request){
        Integer queueId = Integer.parseInt(request.getParameter("queueId"));
        return JsonData.buildSuccess(orderDao.orderFindByQueueId(queueId));
    }

    /**
     * 查看所有未完成的订单
     * @return
     */
    @GetMapping("/ordersFindByState")
    public Object ordersFindByState(){
        String state = "未完成";
        return JsonData.buildSuccess(orderDao.ordersFindByState(state));
    }

}


