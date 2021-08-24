package com.myapplication.foodOrderSystem.dao;

import com.myapplication.foodOrderSystem.domain.Menu;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author 朱香原
 */
@Mapper
public interface MenuDao {
    //推荐使用#{}取值，不要用${},因为存在注入的风险
    @Insert("INSERT INTO menu(name,price,scale,copies) VALUES(#{name}, #{price}, #{scale},#{copies})")
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")   //keyProperty java对象的属性；keyColumn表示数据库的字段
    int insert(Menu menu);

    /**
     * 功能描述：查找全部
     * @return
     */
    @Select("SELECT * FROM menu")
    List<Menu> findMenu();

    @Select("SELECT price FROM menu WHERE name = #{name}")
    Double priceFindByName(String name);

    @Select("SELECT scale FROM menu WHERE name = #{name}")
    String scaleFindByName(String name);

    @Select("SELECT copies FROM menu WHERE name = #{name}")
    Integer copiesFindByName(String name);


    /**
     * 重新设置菜品的价格
     * @param price
     * @param name
     */
    @Update("UPDATE menu SET price = #{price} WHERE name = #{name}")
    void updatePrice(@Param("price")Double price,@Param("name")String name);

    /**
     * 功能描述：更新菜单里面菜品份量
     * @param
     */
    @Update("UPDATE menu SET copies=#{copies} WHERE name =#{name}")
    void updateCopies(@Param("copies") Integer copies,@Param("name") String name);

    //错误，因为传入了两个参数
//    Update("UPDATE menu SET copies=#{copies} WHERE name =#{name}")
////    void updateCopies(Integer copies,String name);


}
