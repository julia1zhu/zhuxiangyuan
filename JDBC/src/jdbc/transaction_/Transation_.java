package jdbc.transaction_;

import jdbc.utils.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author 朱香原
 * 演示Jdbc中如何使用事务
 */
public class Transation_ {

    //没有使用事务
    @Test
    public void noTransation() {

        //1. 得到连接
        Connection connection = null;
        //2. 组织一个sql
        String sql = "update account set balance = balance - 100 where id = 1";
        String sql1 = "update account set balance = balance + 100 where id = 2";
        PreparedStatement preparedStatement = null;
        try {
            connection = JDBCUtils.getConnection(); //在默认情况下，connection是默认自动提交
            //执行第一条语句
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();

            int i = 1/0;  //抛出异常 ，下面语句不再执行
            //执行第二条语句
            PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
            preparedStatement1.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //关闭资源
            JDBCUtils.close(null,preparedStatement,connection);
        }
    }

    @Test
    //事务来解决
    public void transation() {
        //1. 得到连接
        Connection connection = null;
        //2. 组织一个sql
        String sql = "update account set balance = balance - 100 where id = 1";
        String sql1 = "update account set balance = balance + 100 where id = 2";
        PreparedStatement preparedStatement = null;
        try {
            connection = JDBCUtils.getConnection(); //在默认情况下，connection是默认自动提交
            //将Connection设置为不自动提交
            connection.setAutoCommit(false);
            //执行第一条语句
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();

          //  int i = 1/0;  //抛出异常 ，下面语句不再执行
            //执行第二条语句
            PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
            preparedStatement1.executeUpdate();

            //这里提交事务
            connection.commit();
        } catch (Exception e) {
            //这里我们可以进行回滚，即撤销执行的sql
            //默认回滚到事务开始的状态
            System.out.println("执行发生了异常，回滚撤销执行的sql");
            try {
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            //关闭资源
            JDBCUtils.close(null,preparedStatement,connection);
        }
    }
}
