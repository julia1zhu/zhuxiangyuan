package outputstream;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 朱香原
 */
@SuppressWarnings("all")
public class FileOutputStream01 {
    public static void main(String[] args) {
    }

    /**
     * 演示使用FileOutputStream 将数据写到文件中
     * 如果该文件不存在，则创建该文件
     */
    @Test
    public void writeFile() throws IOException {

        //创建FileOutputStream对象
        String filePath = "d:\\a.txt";
        FileOutputStream fileOutputStream = null;

        try {
            //说明：
            //1. new FileOutputStream(filePath)创建方式，当写入内容时，会覆盖原来的内容
            //2. new FileOutputStream(filePath，true)创建方式，当写入内容时，是追加到文件的后面
            fileOutputStream = new FileOutputStream(filePath);
            //写入一个字节
            fileOutputStream.write('H');
            //写入一个字符串
            String str = "hello,world";
            //str.getBytes() 可以把字符串->字节数组
            fileOutputStream.write(str.getBytes());
            //write(byte[] b,int off,int len)
            fileOutputStream.write(str.getBytes(),0,str.length());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            fileOutputStream.close();
        }
    }
}
