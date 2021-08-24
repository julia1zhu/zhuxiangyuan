package com.myapplication.foodOrderSystem.dao;

import com.myapplication.foodOrderSystem.domain.FoodConsume;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author 朱香原
 */
@Mapper
public interface ConsumeDao {
    //向数据表里面添加新的菜品消费信息，主要是添加名字，开始的消费数量和消费收入为0
    @Insert("INSERT INTO foodconsume(name,consumption,food_revenue,ordered_time) VALUES(#{name},#{consumption},#{foodRevenue},#{orderedTime})")
    int insert(@Param("name")String name,@Param("consumption")Integer consumption,
               @Param("foodRevenue")Double foodRevenue, @Param("orderedTime") Date orderedTime);

    //统计每个菜品的消费量和实际营收金额（支持按营收和被消费的份数进行排序——支持正序和倒序）
    @Select("SELECT name,SUM(consumption) AS total_consumption FROM foodconsume GROUP BY name ORDER BY total_consumption")
    List<Map<String,Double>> orderByConsumption();

    @Select("SELECT name,SUM(food_revenue) FROM foodconsume  GROUP BY name ORDER BY food_revenue")
    List<Map<String,Double>> orderByFoodRevenue();

    @Select("SELECT name,SUM(consumption) AS total_consumption FROM foodconsume GROUP BY name ORDER BY total_consumption DESC")
    List<Map<String,Integer>> orderByConsumptionDesc();

    @Select("SELECT name,SUM(food_revenue) FROM foodconsume  GROUP BY name ORDER BY food_revenue DESC")
    List<Map<String,Integer>> orderByFoodRevenueDesc();


    //6>获取近期的爆款菜品（近5天被点份数数最多的菜品）
    @Select("SELECT name FROM " +
            "(SELECT name,SUM(consumption) AS total_consumption FROM foodconsume WHERE datediff(d,ordered_time,getdate())<=5 GROUP BY name ORDER BY total_consumption)  AS newTable " +
            "WHERE total_consumption = (SELECT MAX(total_consumption) FROM newTable)")
    String count();

    //7>统计每天赠送的菜品详情
    //模糊字
    @Select("SELECT name,SUM(consumption) AS total_consumption FROM foodconsume WHERE name LIKE '%(赠)' GROUP BY name ")
    Map<String,Integer> findGift();

}
