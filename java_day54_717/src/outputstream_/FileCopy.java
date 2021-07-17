package outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 朱香原
 */
@SuppressWarnings("all")
public class FileCopy {
    public static void main(String[] args) {
        //完成文件拷贝，将d:\\毕业照.jpg拷贝到c:\\

        //1.创建文件的输入流，将文件读入到程序
        //2. 创建文件的输出流，将读取的程序写入到指定的文件
        String srcFilePath = "d:\\毕业照.jpg";
        String destFilePath = "d:\\毕业照2.jpg";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {

            fileInputStream = new java.io.FileInputStream(srcFilePath);
            fileOutputStream = new FileOutputStream(destFilePath);
            //定义一个字节数组，提高读取效果
            byte[] buf = new byte[1024];
            int readLen = 0;
            while((readLen = fileInputStream.read(buf)) != -1){
                //读取到后，就写入到文件
                //即边读边写
                fileOutputStream.write(buf,0,readLen); //一定要写入这个方法
            }
            System.out.println("拷贝成功");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
