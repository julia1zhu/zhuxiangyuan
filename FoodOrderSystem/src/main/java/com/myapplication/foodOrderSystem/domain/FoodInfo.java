package com.myapplication.foodOrderSystem.domain;

import com.myapplication.foodOrderSystem.dao.MembershipDao;
import com.myapplication.foodOrderSystem.dao.MenuDao;
import com.myapplication.foodOrderSystem.utils.SpringTool;


/**
 * @author 朱香原
 */
public class FoodInfo {
    private String foodName;
    private String scale;
    private Integer copies;
    private Double subTotal;

    public FoodInfo() {
    }

    //会员用这个
    public FoodInfo(String foodName, Integer copies) {
        MenuDao menuDao = (MenuDao) SpringTool.getBean("menuDao");
        this.foodName = foodName;
        this.scale = menuDao.scaleFindByName(foodName);
        this.copies = copies;
        this.subTotal = copies * menuDao.priceFindByName(foodName);

    }

    @Override
    public String toString() {
        return "FoodInfo{" +
                "foodName='" + foodName + '\'' +
                ", scale='" + scale + '\'' +
                ", copies=" + copies +
                ", subTotal=" + subTotal +
                '}';
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public Integer getCopies() {
        return copies;
    }

    public void setCopies(Integer copies) {
        this.copies = copies;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }
}
