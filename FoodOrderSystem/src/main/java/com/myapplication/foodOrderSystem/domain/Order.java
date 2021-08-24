package com.myapplication.foodOrderSystem.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.myapplication.foodOrderSystem.dao.MembershipDao;
import com.myapplication.foodOrderSystem.utils.SpringTool;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


/**
 * @author 朱香原
 */


public class Order {
    private Integer id; //订单编号
    private Integer queueId; //排队序号

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date startTime;//订单生成时间
    private String state = "未完成"; // 订单状态

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date endTime; //订单完成时间
    private Double orderDiscount;  //折扣信息
    private Integer memberId; //会员编号
    private Double totalAmount;
    private Double realPayment;
    private String foodInfoList;

    public Order() {
    }

    public Order(Integer queueId, Integer memberId, Double totalAmount, String foodInfoList) {
        MembershipDao membershipDao = (MembershipDao)SpringTool.getBean("membershipDao");
        this.queueId = queueId;
        this.memberId = memberId;
        this.orderDiscount = membershipDao.discountFindById(memberId);
        this.foodInfoList = foodInfoList;
        this.totalAmount = totalAmount;
//        this.realPayment = totalAmount * orderDiscount;
        this.realPayment = Double.parseDouble(String.format("%.2f",totalAmount * orderDiscount));
        this.startTime = new Date();

    }

    public Order(Integer queueId, Double totalAmount, String foodInfoList) {
        this.queueId = queueId;
        this.foodInfoList = foodInfoList;
        this.totalAmount = totalAmount;
        this.realPayment = totalAmount;
        this.startTime = new Date();
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", queueId=" + queueId +
                ", startTime=" + startTime +
                ", state='" + state + '\'' +
                ", endTime=" + endTime +
                ", orderDiscount=" + orderDiscount +
                ", memberId=" + memberId +
                ", totalAmount=" + totalAmount +
                ", realPayment=" + realPayment +
                ", foodInfoList='" + foodInfoList + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQueueId() {
        return queueId;
    }

    public void setQueueId(Integer queueId) {
        this.queueId = queueId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Double getOrderDiscount() {
        return orderDiscount;
    }

    public void setOrderDiscount(Double orderDiscount) {
        this.orderDiscount = orderDiscount;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getRealPayment() {
        return realPayment;
    }

    public void setRealPayment(Double realPayment) {
        this.realPayment = realPayment;
    }


    public String getFoodInfoList() {
        return foodInfoList;
    }

    public void setFoodInfoList(String foodInfoList) {
        this.foodInfoList = foodInfoList;
    }
}


