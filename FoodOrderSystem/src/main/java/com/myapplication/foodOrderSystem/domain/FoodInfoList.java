package com.myapplication.foodOrderSystem.domain;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author 朱香原
 */
public class FoodInfoList {
    private List<String> foodNameList = new LinkedList<>();
    private List<Integer> foodCopies = new LinkedList<>();
    private Integer memberId;

    public FoodInfoList() {
    }


    public FoodInfoList(List<String> foodNameList, List<Integer> foodCopies, Integer memberId) {
        this.foodNameList = foodNameList;
        this.foodCopies = foodCopies;
        this.memberId = memberId;
    }

    public FoodInfoList(List<String> foodNameList, List<Integer> foodCopies) {
        this.foodNameList = foodNameList;
        this.foodCopies = foodCopies;
    }

    public List<String> getFoodNameList() {
        return foodNameList;
    }

    public void setFoodNameList(List<String> foodNameList) {
        this.foodNameList = foodNameList;
    }

    public List<Integer> getFoodCopies() {
        return foodCopies;
    }

    public void setFoodCopies(List<Integer> foodCopies) {
        this.foodCopies = foodCopies;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }
}
