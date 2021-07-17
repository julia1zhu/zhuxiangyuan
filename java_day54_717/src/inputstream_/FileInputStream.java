package inputstream;

import org.junit.jupiter.api.Test;

import java.io.IOException;


/**
 * @author 朱香原
 * 演示FileInputStream的使用（字节输入流 文件-->程序）
 */
@SuppressWarnings("all")
public class FileInputStream {
    public static void main(String[] args) {
    }

    /**
     *演示读取文件
     * 单个字节的读取，效率比较低
     * ->使用read(byte[] b）读取
     */
    @Test
    public  void readFile01() throws IOException {
        String filePath = "d:\\hello.txt";
        int readData = 0;

        java.io.FileInputStream fileInputStream = null;
        try {
            //创建FileInputStream对象，用于读取文件
            fileInputStream = new java.io.FileInputStream(filePath);
            //从该输入流读取一个字节的数据。如果没有输入可用，此方法将阻止。
            // 如果返回-1，表示读取完毕
            while((readData = fileInputStream.read()) != -1){
                System.out.print((char)readData);  //转成char显示
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭文件流、释放资源
            fileInputStream.close();
        }
    }

    /**
     * 使用read(byte[] b）读取,提高效率
     */
    @Test
    public void readFile02() throws IOException {
        String filePath = "d:\\hello.txt";
        //字节数组
        byte[] buf = new byte[8]; //一次读取8个字节
        int readLen = 0;
        java.io.FileInputStream fileInputStream = null;
        try {
            //创建FileInputStream对象，用于读取文件
            fileInputStream = new java.io.FileInputStream(filePath);
            //从该输入流读取一个字节的数据。如果没有输入可用，此方法将阻止。
            // 如果返回-1，表示读取完毕
            //如果读取正常，返回实际读取的字节数
            while((readLen = fileInputStream.read(buf)) != -1){
                System.out.print(new String(buf,0,readLen));  //转成char显示
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭文件流、释放资源
            fileInputStream.close();
        }
    }
}
