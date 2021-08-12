package jdbc.statement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

/**
 * @author 朱香原
 * 演示statement的注入问题
 */
public class Statement_ {
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

        //3. 得到Statement
        Statement statement = connection.createStatement();

        //4. 组织sql
        String sql = "select name,pwd from admin where name = '"
                + admin_name + "' and pwd =  '" + admin_pwd + "'";
        ResultSet resultSet = statement.executeQuery(sql);
        if(resultSet.next()){ //如果查询到一条记录，这说明该管理存在
            System.out.println("恭喜，登录成功");
        }else{
            System.out.println("对不起，登陆失败");
        }

        //5. 资源关闭
        resultSet.close();
        statement.close();
        connection.close();
        

    }
}
