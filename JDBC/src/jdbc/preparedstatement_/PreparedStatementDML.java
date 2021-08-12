package jdbc.preparedstatement_;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.util.Scanner;

/**
 * @author 朱香原
 */
public class PreparedStatementDML {
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
        //添加记录
       // String sql = "insert into amdin valuse(?,?)";

        //修改记录
        String sql = "update admin set pwd = ? where name = ?";

        //3.2 preparedStatement 对象实现了PreparedStatement 接口的实现类的对象
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //3.3 给？赋值
        preparedStatement.setString(2,admin_name);
        preparedStatement.setString(1,admin_pwd);

        //4. 如果执行的是dml(update,insert,delete) executeUpdate()
        int rows = preparedStatement.executeUpdate();
        System.out.println(rows > 0 ? "执行成功" : "执行失败");

        //5. 资源关闭

        preparedStatement.close();
        connection.close();
    }
}
