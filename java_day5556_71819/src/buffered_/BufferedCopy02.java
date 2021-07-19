import java.io.*;

/**
 * @author 朱香原
 * 编程完成图片/音乐的拷贝
 */
public class BufferedCopy02 {
    public static void main(String[] args) throws IOException {

        String srcFilePath = "d:\\毕业照.jpg";
        String destFilePath = "d:\\毕业照3.jpg";

        //创建对象
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(srcFilePath));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destFilePath));

            //循环读取文件，并且写入文件
            byte[] buff = new byte[1024];
            int readLen = 0;
            while((readLen = bufferedInputStream.read(buff)) != -1) {
                bufferedOutputStream.write(buff,0,readLen);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭流
            if(bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            if(bufferedOutputStream != null) {
                bufferedOutputStream.close();
            }
        }
    }
}
