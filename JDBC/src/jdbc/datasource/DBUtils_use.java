package jdbc.datasource;

import jdbc.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author 朱香原
 */
public class DBUtils_use {
    //使用apache-DBUtils 工具类 + druid完成对表的crud操作

    @Test
    public void testQueryMany() throws SQLException { //返回结果是多行的情况

        //1. 得到连接（druid）
        Connection connection = JDBCUtilsDruid.getConnection();;
        //2. 使用DBUtils的类和接口，先引入DBUtils相关的jar，加入到本Project
        //3. 创建QueryRunner
        QueryRunner queryRunner = new QueryRunner();
        //4. 可以执行相关的方法，返回ArrayList结果集
        String sql = "select * from actor where id >= ?";
        //(1) query 方法就是执行sqL语句，得到resultset ---封装到--> ArrayList 集合中
        //(2)返回集合
        //(3) connection: 连接
        //(4) sql :执行的sqL语句
        //(5) new BeanListHandLer<> (Actor.class): 在将resultset ->Actor对象->封装到ArrayL ist
        //(6) 底层使用反射机制去获取Actor类的属性，然后进行封装
        //（7） 1 是给sql语句中的？赋值， 可以有多个值，因为是可变参数
        //(8)底层得到的resultset， 会在query关闭，关闭PreparedStatment
        List<Actor> list =
                queryRunner.query(connection, sql, new BeanListHandler<>(Actor.class), 1);

        for (Actor actor : list) {
            System.out.println(actor);
        }

        //释放资源
        JDBCUtilsDruid.close(null,null,connection);
    }

    @Test
    //演示 apache-dbutils + druid 完成 返回的结果是单行记录（单个对象）
    public void testQuerySingle() throws SQLException {
        //1. 得到连接（druid）
        Connection connection = JDBCUtilsDruid.getConnection();;
        //2. 使用DBUtils的类和接口，先引入DBUtils相关的jar，加入到本Project
        //3. 创建QueryRunner
        QueryRunner queryRunner = new QueryRunner();
        //4. 可以执行相关的方法，返回单个对象
        String sql = "select * from actor where id = ?";
        //老韩解读
        // 因为我们返回的单行记录<单个对象> 使用的Hander是BeanHandler
        Actor actor = queryRunner.query(connection, sql, new BeanHandler<>(Actor.class), 1);
        System.out.println(actor);

        //释放资源
        JDBCUtils.close(null,null,connection);

    }

    @Test
    //演示apache-dbutils + druid 完成查询结果是单行单列-返回的是Object
    public void testScalar() throws SQLException {
        //1. 得到连接（druid）
        Connection connection = JDBCUtilsDruid.getConnection();;
        //2. 使用DBUtils的类和接口，先引入DBUtils相关的jar，加入到本Project
        //3. 创建QueryRunner
        QueryRunner queryRunner = new QueryRunner();
        //4. 可以执行相关的方法，返回单行单列，返回的就是Object
        String sql = "select NAME from actor where id = ?";
        Object query = queryRunner.query(connection, sql, new ScalarHandler<>(), 1);
        System.out.println(query);

        //释放资源
        JDBCUtils.close(null,null,connection);
    }

    @Test
    //演示apache—dbutils + druid 完成dml（update，insert，delete）
    public void testDML() throws SQLException {
        //1. 得到连接（druid）
        Connection connection = JDBCUtilsDruid.getConnection();;
        //2. 使用DBUtils的类和接口，先引入DBUtils相关的jar，加入到本Project
        //3. 创建QueryRunner
        QueryRunner queryRunner = new QueryRunner();

        //4. 可以组织sql语句，完成update，insert，delete
//        String sql = "update actor set name = ? where id = ?";
        String sql = "insert into actor values (null,'林青霞','女','1966-10-10','116')";

        //
//        int affectRow = queryRunner.update(connection, sql, "张三丰", 1);
        int affectRow = queryRunner.update(connection, sql);
        System.out.println(affectRow > 0 ? "执行成功" : "执行没有影响到表");

        //释放资源
        JDBCUtils.close(null,null,connection);
    }

}

