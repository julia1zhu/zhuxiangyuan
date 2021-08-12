package jdbc.preparedstatement_;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Scanner;

/**
 * @author 朱香原
 * 演示PrepareStatement使用
 */
@SuppressWarnings("all")
public class PreparedStatement_ {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        //让用户输入管理员名和密码
        System.out.println("请输入管理员的名字："); //next()：当接收到空格或者'表示结束
        String admin_name = scanner.nextLine(); //如果希望看到SQL注入，这里需要用nextLine
        System.out.println("请输入管理员的密码：");
        String admin_pwd = scanner.nextLine();
        //通过Properties对象获取配置文件的信息
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
        //获取相关的值
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        //1. 注册驱动
        Class<?> aClass = Class.forName(driver);

        //2. 得到连接
        Connection connection = DriverManager.getConnection(url, user, password);

        //3. 得到PreparedStatement
        //3.1 组织sql sql语句的？相当于占位符
        String sql = "select name,pwd from admin where name =? and pwd =?";

        //3.2 preparedStatement 对象实现了PreparedStatement 接口的实现类的对象
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //3.3 给？赋值
        preparedStatement.setString(1,admin_name);
        preparedStatement.setString(2,admin_pwd);

        //4.执行select 语句使用executeQuery
        //如果执行的是dml(update,insert,delete) executeUpdate()
        //这里执行excuteQuery，不要再写sql
        ResultSet resultSet = preparedStatement.executeQuery();
        if(resultSet.next()){ //如果查询到一条记录，这说明该管理存在
            System.out.println("恭喜，登录成功");
        }else{
            System.out.println("对不起，登陆失败");
        }

        //5. 资源关闭
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
}
