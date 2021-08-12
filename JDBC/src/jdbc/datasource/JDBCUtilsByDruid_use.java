package jdbc.datasource;

import jdbc.utils.JDBCUtils;
import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;

/**
 * @author 朱香原
 */
public class JDBCUtilsByDruid_use {
    @Test
    public void testDML() { //insert.update,delete
        //1. 得到连接
        Connection connection = null;
        //2. 组织一个sql
        String sql = "select * from actor where id >= ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = JDBCUtilsDruid.getConnection();
            System.out.println(connection.getClass());//运行类型  class com.alibaba.druid.pool.DruidPooledConnection
            preparedStatement = connection.prepareStatement(sql);
            //给占位符赋值
            preparedStatement.setInt(1, 1);
            //执行,得到结果集
            resultSet = preparedStatement.executeQuery();
            //遍历该结果集
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                java.util.Date borndate = resultSet.getDate("borndate");
                String phone = resultSet.getString("phone");
                System.out.println(id + "\t" + name + "\t" + borndate + "\t" + phone);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            JDBCUtils.close(null, preparedStatement, connection);
        }
    }

    //使用老师的笨方法来解决Result=封装=>arraylist
    @Test
    public void testSelectToArrayList() { //insert.update,delete
        //1. 得到连接
        Connection connection = null;
        //2. 组织一个sql
        String sql = "select * from actor where id >= ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        ArrayList<Actor> list = new ArrayList();
        try {
            connection = JDBCUtilsDruid.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            //给占位符赋值
            preparedStatement.setInt(1, 1);
            //执行,得到结果集
            resultSet = preparedStatement.executeQuery();
            //遍历该结果集
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String sex = resultSet.getString("sex");
                Date borndate = resultSet.getDate("borndate");
                String phone = resultSet.getString("phone");
                //把得到的resultset的记录，封装到Actor对象，放入到list集合
                list.add(new Actor(id,name,sex,borndate,phone));
            }

            System.out.println("list集合数据=" + list);

            for (Actor actor : list) {
                System.out.println("id=" + actor.getName() + "\t" + actor.getName());
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            JDBCUtils.close(resultSet, preparedStatement, connection);
        }

    }

}
