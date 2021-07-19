/**
 * @author 朱香原
 */

//处理流
public class BufferedReader_ extends Reader_{

    private Reader_ reader_; //属性是Reader_类型

    public BufferedReader_(Reader_ reader_) {
        this.reader_ = reader_;
    }

    //让方法更加灵活，多此读取文件
    public void readFiles(int num) {
        for(int i = 0;i < num;i++){
            reader_.read();
        }
    }

    //扩展readString，批量处理字符串数据
    public void readStrings(int num) {
        for(int i = 0;i < num;i++){
            reader_.read();
        }
    }

    @Override
    public void read() {

    }
}
