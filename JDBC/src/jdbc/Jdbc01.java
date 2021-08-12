package jdbc;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author 朱香原
 * 这是第一个Jdbc程序，完成简单的操作
 */
public class Jdbc01 {
    public static void main(String[] args) throws SQLException {

        // 前置工作：在项目下创建一个文件夹比如 libs
        //将mysql.jar拷贝到该目录下，点击add as library

        //1. 注册驱动
        //  new com.mysql.cj.jdbc.Driver()
        Driver driver = new Driver();

        //2. 得到连接
        //老师解读
        //(1) jdbc :mysql://规定好表示协议，通过jdbc的方式连接mysqL
        //(2) localhost 主机，可以是ip地址
        //(3) 3306 表示mysql监听的端口
        //(4) db02 连接到mysql dbms 的哪个数据库
        //(5) mysql的连接本质就是前面学过的socket连接
        String url = "jdbc:mysql://localhost:3306/db02";
        //将用户名和密码放入到Properties对象
        Properties properties = new Properties();
        //说明：user 和 password是规定好的，后面的值根据实际情况写
        properties.setProperty("user","root");
        properties.setProperty("password","pig621julia");

        Connection connect = driver.connect(url, properties);

        //3. 执行mysql
        //String sql = "insert into actor values(null,'刘德华','男','1970-11-11','110')";
        String sql = "update actor set name ='周星驰' where id = 2";
        //用于执行静态sql语句并返回其生成结果的对象
        Statement statement = connect.createStatement();
        int rows = statement.executeUpdate(sql);  //如果是dml语句，返回的就是影响的行数
        System.out.println(rows>0 ? "成功" : "失败");

        //4. 释放资源
        statement.close();
        connect.close();

    }
}
