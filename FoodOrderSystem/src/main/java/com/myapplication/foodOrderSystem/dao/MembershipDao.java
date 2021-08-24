package com.myapplication.foodOrderSystem.dao;

import com.myapplication.foodOrderSystem.domain.Membership;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author 朱香原
 */
@Mapper
public interface MembershipDao {
    //推荐使用#{}取值，不要用${},因为存在注入的风险
    @Insert("INSERT INTO membership(member_name,discount,account) VALUES(#{memberName}, #{discount},#{account})")
    @Options(useGeneratedKeys = true, keyProperty = "memberId", keyColumn = "member_id")
    //keyProperty java对象的属性；keyColumn表示数据库的字段
    int insert(@Param("memberName") String memberName, @Param("discount") Double discount, @Param("account") Double account);

    /**
     * 功能描述：查找全部
     *
     * @return
     */
    @Select("SELECT * FROM membership")
    @Results({
            @Result(column = "member_id", property = "memberId"),
            @Result(column = "member_name", property = "memberName"),
    })
    List<Membership> getAll();


    /**
     * 功能描述：根据id查看该会员的信息
     *
     * @param
     * @return
     */
    @Select("SELECT * FROM membership WHERE member_id = #{id}")
    @Results({
            @Result(column = "member_id", property = "memberId"),
            @Result(column = "member_name", property = "memberName"),
    })
    Membership findAll(int memberId);

    /**
     * 根据会员id获取该会员可以享受的折扣
     *
     * @param memberId
     * @return
     */
    @Select("SELECT discount FROM membership WHERE member_id = #{memberId}")
    Double discountFindById(int memberId);

    @Select("SELECT account FROM membership WHERE member_id = #{memberId}")
    Double accountFindById(int memberId);

    /**
     * 功能描述：对会员的会员账户中余额进行充值
     *
     * @param account
     * @param memberId
     */
    @Update("UPDATE membership SET account=#{account} WHERE member_id =#{memberId}")
    int update(@Param("account") Double account, @Param("memberId") Integer memberId);

}
