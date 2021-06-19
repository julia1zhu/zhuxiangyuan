package set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author 朱香原
 */
@SuppressWarnings({"all"})
public class SetMethod {
    public static void main(String[] args) {
        // 1. 以Set接口的实现类HashSet来讲解Set接口的方法
        // 2. set接口的实现类的对象（Set接口对象），不能存放重复的元素，可以添加一个null
        // 3. set接口对象存放数据是无需（即添加的顺序和取出的顺序不一样）
        // 4. 注意：取出的顺序虽然不是添加的顺序，但是取出的顺序是一致的
        Set set = new HashSet();
        set.add("john");
        set.add("lucy");
        set.add("john");
        set.add("jack");
        set.add(null);
        set.add(null);

        set.remove(null);

        for(int i = 0;i < 10;i++){
            System.out.println("set=" + set);
        }

        //遍历
        System.out.println("=========迭代器遍历===========");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

        System.out.println("===========增强for循环===============");
        for (Object o : set) {
            System.out.println(o);
        }
    }
}
