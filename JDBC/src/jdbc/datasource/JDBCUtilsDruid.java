package jdbc.datasource;


import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author 朱香原
 * 基于druid数据库连接池的工具类
 */
public class JDBCUtilsDruid {

    private static DataSource ds;

    //在静态代码块完成ds初始化
    static {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src\\druid.properties"));
            ds = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //编写getConnetion方法
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    //关闭连接：在数据库连接池技术中心，close方法不是真的断掉连接
    //而是把使用的Connection对象放回连接池
    public static void close(ResultSet resultSet, Statement statement, Connection connection){
        try {
            //判断是否为null
            if(resultSet != null){
                resultSet.close();
            }
            if(statement != null){
                statement.close();
            }
            if(connection != null) {
                connection.close();
            }
        } catch (Exception e) {
            //将编译异常转成运行异常抛出
            throw new RuntimeException(e);
        }
    }

}
