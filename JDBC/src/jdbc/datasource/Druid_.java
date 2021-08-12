package jdbc.datasource;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

/**
 * @author 朱香原
 * 测试druid的使用
 */
public class Druid_ {

    @Test
    public void testDruid() throws Exception {
        //1. 加入druid的jar包
        //2. 加入配置文件 druid.properties  将该文件拷贝到项目的src目录
        //3. 创建Properties对象，读取配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\druid.properties"));
        //4. 创建一个指定参数的数据库连接池,Druid连接池
        DataSource dataSource =
                DruidDataSourceFactory.createDataSource(properties);

//        Connection connection = dataSource.getConnection();
//        System.out.println("连接成功");
//        connection.close();

        long start = System.currentTimeMillis();
        for(int i = 0;i < 5000;i++){
            Connection connection = dataSource.getConnection();
            //System.out.println("连接成功");
            connection.close();
        }
        long end = System.currentTimeMillis();
        System.out.println("druid连接池 操作5000 耗时=" + (end - start));

    }
}
