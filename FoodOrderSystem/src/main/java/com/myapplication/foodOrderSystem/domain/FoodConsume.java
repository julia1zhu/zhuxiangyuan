package com.myapplication.foodOrderSystem.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author 朱香原
 */
public class FoodConsume {
    private String name;
    private Integer consumption;
    private Double foodRevenue;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date orderedTime;

    public FoodConsume() {
    }

    public FoodConsume(String name, Integer consumption, Double foodRevenue, Date orderedTime) {
        this.name = name;
        this.consumption = consumption;
        this.foodRevenue = foodRevenue;
        this.orderedTime = orderedTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getConsumption() {
        return consumption;
    }

    public void setConsumption(Integer consumption) {
        this.consumption = consumption;
    }

    public Double getFoodRevenue() {
        return foodRevenue;
    }

    public void setFoodRevenue(Double foodRevenue) {
        this.foodRevenue = foodRevenue;
    }

    public Date getOrderdTime() {
        return orderedTime;
    }

    public void setOrderdTime(Date orderedTime) {
        this.orderedTime = orderedTime;
    }
}
