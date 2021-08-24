package com.myapplication.foodOrderSystem.dao;

import com.myapplication.foodOrderSystem.domain.Gift;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.List;

/**
 * @author 朱香原
 */
@Mapper
public interface GiftDao {

    @Insert("INSERT INTO gift(name) VALUES(#{name})")
    int insert(String name);

    //统计共有几个赠品
    @Select("SELECT COUNT(*) FROM gift")
    int count();

    //查看赠品
    @Select("SELECT * FROM gift")
    List<Gift> findAll();
}
