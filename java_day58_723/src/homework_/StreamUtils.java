package upload_;

import java.io.*;

/**
 * @author 朱香原
 * 此类用于演示关于流的读写方法
 */
public class StreamUtils {
    /**
     * 功能：将输入流转换成byte[]
     * @param is
     * @return
     * @throws IOException
     */

    public static byte[] streamToByteArray(InputStream is) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();  //创建输入流对象
        byte[] b = new byte[1024];  //字节数组
        int len;
        while((len = is.read(b)) != -1){
            bos.write(b,0,len); //把读取到的数据，写入bos
        }
        byte[] array = bos.toByteArray();  //将bos转成为一个字节数组
        bos.close();
        return array;
    }

    /**
     * 功能：将InputStream转成String
     * @param is
     * @return
     * @throws IOException
     */

    public static String streamToString(InputStream is) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder builder = new StringBuilder();
        String line;
        while((line = reader.readLine()) != null) {
            builder.append(line + "\r\n");
        }
        return builder.toString();
    }
}
