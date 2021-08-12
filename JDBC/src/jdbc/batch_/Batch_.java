package jdbc.batch_;

import jdbc.utils.JDBCUtils;
import org.junit.Test;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * @author 朱香原
 * 演示java的批处理
 */
public class Batch_ {

    @Test
    //传统方法，添加5000条数据到admin2
    public void noBatch() throws Exception {
        Connection connection = JDBCUtils.getConnection();
        String sql = "insert into admin2 VALUES (null,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        long start = System.currentTimeMillis();
        for(int i = 0; i <5000;i++){
            preparedStatement.setString(1,"jack" + i);
            preparedStatement.setString(2,"666");
            preparedStatement.executeUpdate();
        }
        long end = System.currentTimeMillis();
        System.out.println("传统方式耗时=" + (end - start));
        JDBCUtils.close(null,preparedStatement,connection);
    }

    @Test
    //使用批量方式添加数据
    public void batch() throws Exception {
        Connection connection = JDBCUtils.getConnection();
        String sql = "insert into admin2 VALUES (null,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        System.out.println("开始执行");
        long start = System.currentTimeMillis();
        for(int i = 0; i <5000;i++){
            preparedStatement.setString(1,"jack" + i);
            preparedStatement.setString(2,"666");
            //将sql语句加入到批处理包中
            preparedStatement.addBatch();
            /*
            将sql语句加入到批处理包中 ->看源码/*
            //1．//第一就创建ArrayList - elementData => 0bject[]
            //2. elementData => 0bject[]就会存放我们预处理的sql语句
            //3．当elementData满后,就按照1.5扩容
            //4．当添加到指定的值后，就executeBatch
            //5．批量处理会减少我们发送sql语句的网络开销，而且减少编译次数，因此效率提高
            public void addBatch throws SQLException {
                synchronized(this.checkClosed().getConnectionMutex()){
                    if (this.batchedArgs == nulU){
                        this.batchedArgs = new ArrayList();
                    }

                for(int i =0; i < this.parameterValues.length; ++i) {
                    this.checkAllParameterSet(this.parameterValues[i],this.parameterSstreams[i],i);
                }

                this.batchedArgs.add(new PreparedStatement.BatchParams(this.parameterValues,this,para))
             */
            //当有1000条记录时，再批量执行
            if((i+1) % 1000 ==0) {
                preparedStatement.executeBatch();
                //清空一把
                preparedStatement.clearBatch();
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("批量方式耗时=" + (end - start));
        JDBCUtils.close(null,preparedStatement,connection);
    }
}
