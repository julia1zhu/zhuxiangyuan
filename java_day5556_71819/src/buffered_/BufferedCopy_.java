import java.io.*;

/**
 * @author 朱香原
 */
public class BufferedCopy_ {
    public static void main(String[] args) throws IOException {

        //1. BufferedReader和 BufferedWriter是安装字符操作
        //2．不要去操作二进制文件[音频，视频，doc，pdf]，可能造成文件损坏


        String srcFilePath = "d:\\story.txt";
        String destFilePath = "d:\\story2.txt";
        BufferedReader br = null;
        BufferedWriter bw = null;
        String line;
        try {
            br = new BufferedReader(new FileReader(srcFilePath));
            bw = new BufferedWriter(new FileWriter(destFilePath));
            while((line = br.readLine()) != null){
                //每读取一行，就写入
                bw.write(line);
                //插入一个换行
                bw.newLine();
                System.out.println("拷贝完毕");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            //关闭流
            if(br != null){
                br.close();
            }
            if(bw != null) {
                bw.close();
            }
        }
    }
}
