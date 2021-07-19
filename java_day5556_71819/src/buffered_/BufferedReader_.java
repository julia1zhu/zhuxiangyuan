package reader_;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author 朱香原
 * 演示bufferedReader使用
 */
@SuppressWarnings("all")
public class BufferedReader_ {
    public static void main(String[] args) throws IOException {
        String filePath = "d:\\story.txt";
        //创建bufferedReader对象
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new FileReader(filePath));
        //读取
        String line; //按行读取,效率高
        //说明：
        //1. bufferedReader.readLine()是按行读取文件
        //2．当返回null 时，表示文件读取完毕

        while((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }

        //关闭流,只需要关闭BufferedReader，因为底层会自动的去关闭节点流
        bufferedReader.close();
        /*
             public void close() throws IOException {
        synchronized (lock) {
            if (in == null)
                return;
            try {
                in.close();  //这里的in就是传入的fileReader
            } finally {
                in = null;
                cb = null;
            }
        }
    }

         */
    }
}
