import java.util.ArrayList;

/**
 * @author 朱香原
 */
@SuppressWarnings({"all"})
public class ArrayListSource {
    public static void main(String[] args) {

        // 使用无参构造器创建ArrayList对象
        ArrayList list = new ArrayList();
        //ArrayList list = new ArrayList(8);

        // 使用for循环给list集合添加1——10个数据
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        //使用for循环给list集合添加10——15个数
        for (int i = 11; i <= 15; i++) {
            list.add(i);
        }
        list.add(100);
        list.add(200);
        list.add(null);

        for (Object object : list) {
            System.out.println(object);
        }

    }
}

