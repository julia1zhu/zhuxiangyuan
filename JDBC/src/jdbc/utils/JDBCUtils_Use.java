package jdbc.utils;

import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author 朱香原
 * 该类演示如何使用JDBCUtils工具类，完成dml和select
 */
public class JDBCUtils_Use {

    @Test
    public void testDML(){ //insert.update,delete
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            //1. 得到连接
            connection = JDBCUtils.getConnection();
            //2. 组织一个sql
            String sql = "update actor set name = ? where id =?";
            preparedStatement = connection.prepareStatement(sql);
            //给占位符赋值
            preparedStatement.setString(1,"闫妮");
            preparedStatement.setInt(2,2);

            //执行
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //关闭资源
            JDBCUtils.close(null,preparedStatement,connection);
        }

    }


}
