package jdbc.myjdbc;

/**
 * @author 朱香原
 * mysql数据库实现jdbc接口 【模拟】【mysql厂商开发】
 */
public class MysqlJdbcImpl implements JdbcInterface {
    @Override
    public Object getConnection() {
        System.out.println("得到mysql的连接");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("完成mysql的增删改查");
    }

    @Override
    public void close() {
        System.out.println("关闭mysql连接");
    }
}
