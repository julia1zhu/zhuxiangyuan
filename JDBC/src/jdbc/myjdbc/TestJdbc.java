package jdbc.myjdbc;

/**
 * @author 朱香原
 */
@SuppressWarnings("all")
public class TestJdbc {
    public static void main(String[] args) {
        //完成对mysql的操作
        JdbcInterface jdbcInterface = new MysqlJdbcImpl();
        jdbcInterface.getConnection();  //通过接口来调用实现类【动态绑定】
        jdbcInterface.crud();
        jdbcInterface.close();


        //完成对oracle的操作
        jdbcInterface = new OracleJdbcImpl();
        jdbcInterface.getConnection();  //通过接口来调用实现类【动态绑定】
        jdbcInterface.crud();
        jdbcInterface.close();


    }
}
