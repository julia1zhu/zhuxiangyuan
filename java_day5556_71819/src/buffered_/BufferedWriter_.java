package writer_;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 朱香原
 * 演示BufferedWriter的使用
 */
public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "d:\\ok.txt";

        //创建一个BufferedWriter对象
        //说明
        //1. new BufferedWriter(new FileWriter(filePath,true)):表示以追加的方式写入
        //1. new BufferedWriter(new FileWriter(filePath)):表示以覆盖的方式写入
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true));
        bufferedWriter.write("hello,world");
        //插入一个系统相关换行符号
        bufferedWriter.newLine();
        bufferedWriter.write("hello,world");
        bufferedWriter.newLine();
        bufferedWriter.write("hello,world");
        bufferedWriter.newLine();


        //说明：关闭外层流即可
        bufferedWriter.close();
    }
}
