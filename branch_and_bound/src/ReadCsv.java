import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 */
public class ReadCsv {
    public static void main(String[] args) throws IOException {
        readValues();
    }


    public static void readValues() throws IOException {
        //想要读取的数据是一个[N,Dim]的二维矩阵
        File inFile = new File("C:\\Users\\zhu621\\Desktop\\flight_pairing\\c.csv");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inFile));

            String line = " ";
            String[] splitline = null;
            List<String[]> al1String = new ArrayList<>();
            while((line = reader.readLine()) != null ){
                //但是返回的是一个String，我们可以对这个String进行操作，按照分隔符将其分割，最好能是能够保存到一个完整的结构中
//                System.out.println(line);
                splitline = line.split(",");
                al1String.add(splitline);
                //这里每一列的元素都是一个double数值，例如
                //因此接下来我能够直接的转换成Double类型的变量
            }
            reader.close();
            for (String[] strings : al1String) {
                for (String string : strings) {
                    System.out.print(string + " ");
                }
                System.out.println("\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

