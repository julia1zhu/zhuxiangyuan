package dao_.dao;

import jdbc.datasource.JDBCUtilsDruid;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author 朱香原
 * 开发VasicDAO，是其他DAO的父类
 */
public class BasicDAO<T> { //泛型指定具体类型

    private QueryRunner qr = new QueryRunner();
    
    //开发通用的dml方法，针对任意的表
    public int update(String sql,Object...parameters) throws SQLException {
        Connection connection = null;

        connection = JDBCUtilsDruid.getConnection();
        int update = qr.update(connection, sql, parameters);
        
        JDBCUtilsDruid.close(null,null,connection);
        return update;
    }

    /**
     * 
     * @param sql sql语句，可以有？
     * @param clazz  传入一个类的Class对象，比如 Actor.class
     * @param parameters 传入？的具体的值，可以是多个
     * @return 根据Actor.class 返回对应的ArrayList集合
     */
    //返回多个对象，（查询的结果是多行，针对任意表）
    public List<T> qureyMulti(String sql,Class<T> clazz,Object...parameters) throws SQLException {
        Connection connection = null;
        connection = JDBCUtilsDruid.getConnection();
        List<T> query = qr.query(connection, sql, new BeanListHandler<>(clazz), parameters);
        qr.query(connection, sql, new BeanListHandler<>(clazz), parameters);
        JDBCUtilsDruid.close(null,null,connection);
        return query;
    }

    //查询单行结果的通用方法
    public T querySingle(String sql,Class<T> clazz,Object...parameters) throws SQLException {
        Connection connection = null;
        connection = JDBCUtilsDruid.getConnection();
        T query = qr.query(connection, sql, new BeanHandler<>(clazz), parameters);
        JDBCUtilsDruid.close(null,null,connection);
        return query;
    }

    //查询单行单列的方法，即返回单值得方法
    public Object queryScalar(String sql,Object...parameters) throws SQLException {
        Connection connection = null;
        connection = JDBCUtilsDruid.getConnection();
        Object query = qr.query(connection, sql, new ScalarHandler<>(), parameters);
        JDBCUtilsDruid.close(null,null,connection);
        return query;
    }
}
