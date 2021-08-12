package jdbc.myjdbc;

/**
 * @author 朱香原
 */
public class OracleJdbcImpl implements JdbcInterface {
    @Override
    public Object getConnection() {
        System.out.println("得到oracle的连接");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("完成oracle的增删改查");
    }

    @Override
    public void close() {
        System.out.println("完成oracle的关闭");
    }
}
