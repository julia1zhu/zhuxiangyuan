package com.myapplication.foodOrderSystem.dao;

import com.myapplication.foodOrderSystem.domain.Order;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;
import java.util.Map;


/**
 * @author 朱香原
 */
@Mapper
public interface OrderDao {
    //推荐使用#{}取值，不要用${},因为存在注入的风险
    @Insert("INSERT INTO foodorder(queue_id,food_info,start_time,state,end_time,total_amount,order_discount,real_payment,member_id) " +
            "VALUES(#{queueId},#{foodInfoList},#{startTime},#{state},#{endTime},#{totalAmount},#{orderDiscount},#{realPayment},#{memberId})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    //keyProperty java对象的属性；keyColumn表示数据库的字段
    int insert(Order order);


    /**
     * 功能描述：查找全部
     *
     * @return
     */
    @Select("SELECT * FROM foodorder")
    @Results({
            @Result(column = "queue_id", property = "queueId"),
            @Result(column = "food_info", property = "foodInfoList"),
            @Result(column = "start_time", property = "startTime"),
            @Result(column = "end_time", property = "endTime"),
            @Result(column = "total_amount", property = "totalAmount"),
            @Result(column = "order_discount", property = "orderDiscount"),
            @Result(column = "real_payment", property = "realPayment"),
            @Result(column = "member_id", property = "memberId"),
    })
    List<Order> findAllOrders();


    /**
     * 功能描述：根据排队序号找对象
     *
     * @param id
     * @return
     */
    @Select("SELECT * FROM foodorder WHERE queue_id = #{queueId}")
    @Results({
            @Result(column = "food_info", property = "foodInfoList"),
            @Result(column = "start_time", property = "startTime"),
            @Result(column = "end_time", property = "endTime"),
            @Result(column = "total_amount", property = "totalAmount"),
            @Result(column = "order_discount", property = "orderDiscount"),
            @Result(column = "real_payment", property = "realPayment"),
            @Result(column = "member_id", property = "memberId"),
    })
    List<Order> orderFindByQueueId(int id);

    @Select("SELECT real_payment FROM foodorder WHERE member_id = #{memberId}")
    Double findPaymentByMemberId(Integer memberId);





    /**
     * 查看当前时刻没有完成的订单
     * @param state
     * @return
     */
    @Select("SELECT * FROM foodorder WHERE state = #{state}")
    @Results({
            @Result(column = "queue_id", property = "queueId"),
            @Result(column = "food_info", property = "foodInfoList"),
            @Result(column = "start_time", property = "startTime"),
            @Result(column = "end_time", property = "endTime"),
            @Result(column = "total_amount", property = "totalAmount"),
            @Result(column = "order_discount", property = "orderDiscount"),
            @Result(column = "real_payment", property = "realPayment"),
            @Result(column = "member_id", property = "memberId"),
    })
    List<Order> ordersFindByState(String state);

    /**
     * 统计每天折扣前营收
     * @param day
     * @param month
     * @return
     */
    @Select("SELECT sum(total_amount) FROM foodorder WHERE month(start_time)=#{month} AND day(start_time)= #{day}")
    Double countDiscountlRevenue(@Param("day") Integer day,@Param("month") Integer month);

    /**
     * 统计每天真实营收
     * @param day
     * @param month
     * @return
     */
    @Select("SELECT sum(real_payment) FROM foodorder WHERE month(start_time)=#{month} AND day(start_time)= #{day}")
    Double countTotalRevenue(@Param("day") Integer day,@Param("month") Integer month);

    /**
     * 统计每天营业多少订单
     * @param day
     * @param month
     * @return
     */
    @Select("SELECT COUNT(*) FROM foodorder WHERE month(start_time)=#{month} AND day(start_time)= #{day}")
    Integer countOrdersAmount(@Param("day") Integer day,@Param("month") Integer month);

    /**
     * 当订单完成之后将订单的状态设置为已完成，并及时更新完成时间
     * @param state
     * @param endTime
     * @param id
     */
    @Update("UPDATE foodorder SET state=#{state},end_time = #{endTime} WHERE id =#{id}")
    void updateOrderState(@Param("state") String state,@Param("endTime") Date endTime,@Param("id") Integer id);

    @Select("SELECT id,(IFNULL(end_time,0)-IFNULL(start_time,0)) AS waiting_time FROM foodorder Order BY waiting_time")
    List<Map<Integer,Date>> countWaitingTime();
}



