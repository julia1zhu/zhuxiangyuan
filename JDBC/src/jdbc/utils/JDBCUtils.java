package jdbc.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * @author 朱香原
 * 这是一个工具类，完成mysql连接与关闭资源
 */
public class JDBCUtils {
    //定义相关的属性（4个），因为只需要一份，因此，我们做成静态的
    private static  String user; //用户名
    private static  String password;  //密码
    private static  String url; //url
    private static  String driver; //驱动名

    //在static代码块去初始化
    static{

        try{
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
        //读取相关的属性值
        user = properties.getProperty("user");
        password = properties.getProperty("password");
        url = properties.getProperty("url");
        driver = properties.getProperty("driver");
        } catch (IOException e) {
            //在实际开发中，我们可以这样处理
            //1. 将编译异常 转成 运行异常
            //2. 这是调用者，可以选择捕获该异常，也可以选择默认处理该异常，比较方便处理
            throw new RuntimeException(e);
        }
    }

    //连接数据库，返回Connection
        public static Connection getConnection() {
            try {
                return DriverManager.getConnection(url,user,password);
            } catch (SQLException e) {
            //1. 将编译异常 转成 运行异常
            //2. 这是调用者，可以选择捕获该异常，也可以选择默认处理该异常，比较方便处理
            throw new RuntimeException(e);
        }
    }

    //关闭相关资源
    /*
       1. ResultSet 结果集
       2. Statement或者PreparedStatement
       3. Connection
     */
    public static void close(ResultSet set, Statement statement, Connection connection){
        try {
            //判断是否为null
            if(set != null){
                set.close();
            }

            if(statement != null){
                statement.close();
            }

            if(connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            //1. 将编译异常 转成 运行异常
            //2. 这是调用者，可以选择捕获该异常，也可以选择默认处理该异常，比较方便处理
            throw new RuntimeException(e);
        }
    }

}
