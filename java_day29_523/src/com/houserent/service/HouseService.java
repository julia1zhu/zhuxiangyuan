package com.houserent.service;

import com.houserent.domain.House;

/**
 * HouseService.java<=>类[业务层]//
 * 定义House[] ,保有House对象
 * 1，响应HouseView的调用
 * 2，完成对房屋信息的各种操作(增删改查c[create]r[readJu[update]d[delete])
 */
public class HouseService {
        private House[] houses;
        private int houseNums = 1;// 记录当前有多少个房屋信息
        private int idCounter = 1;// 记录当前的id自增长到哪个值了

        // 构造器
        public HouseService(int size){
            // new houses
            houses = new House[size];

        //为了配合测试列表信息，初始化一个House对象
        houses[0] = new House(2, "none", "116", "昌平区", 5000, "已出租");
        }

        public House[] list(){
            return houses;
        }

        // 添加新对象，返回boolean
        public boolean add(House newHouse){
            // 判断是否还可以继续添加
            if(houseNums == houses.length){// 不能再添加
                System.out.println("数组已满，不能再添加了");
                return false;
            }
            //把newHouse对象加入到数组，增加了一个房屋信息
            houses[houseNums++] = newHouse;
            // 程序员需要设计一个id自增长的机制
            newHouse.setId(++idCounter);
            return true;
        }


        //del方法，删除一个房屋信息
        public boolean del(int delId){
            // 应当先找到要删除的房屋信息对应的下标
            // 一定要搞清楚房屋信息的编号和下标不是一回事
            int index = -1;
            for(int i = 0;i < houseNums;i++){
                if(delId == houses[i].getId()){// 要删除的房屋（id）,是数组下标为i的元素
                    index = i; //使用index记录i
                 }
              }

              if (index == -1){// 说明delId在数组中不存在
                  return false;
              }

              // 如果找到，
            for(int i = index;i < houseNums - 1;i++){
                houses[i] = houses[i+1];
            }
            houses[--houseNums] = null; // 把当前存在的房屋信息的最后一个置空
            return true;

        }

        // search方法，查找一个房屋信息
        public House search(int searchId){
            for(int i = 0;i < houseNums;i++){
                if(searchId == houses[i].getId()){
                    return houses[i];
                }
            }
            return null;
        }

}
