package set_;

import java.util.HashSet;

/**
 * @author 朱香原
 */
@SuppressWarnings({"all"})
public class HashSet01 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        System.out.println(set.add("john")); //T
        System.out.println(set.add("Lucy")); //T
        System.out.println(set.add("john")); //F
        System.out.println(set.add("jack")); //T
        System.out.println(set.add("Rose")); //T

        System.out.println("set=" + set);
        //说明：
        // 1. 在执行add方法后，会返回一个boolean值
        // 2. 如果添加成功，会返回true，否则返回false
        // 3. 可以通过remove指定删除哪个对象

        set.remove("john");
        System.out.println("set=" + set);

        //4. HashSet不能添加相同的元素/数据
        set = new HashSet();
        System.out.println("set=" + set);
        set.add("Lucy");
        set.add("Lucy");
        set.add(new Dog("tom"));
        set.add(new Dog("tom"));
        System.out.println("set=" + set);

        // 经典的面试题
        // 看源码，作分析
        set.add(new String("hsp"));
        set.add(new String("hsp"));// 加入不了

    }
}

class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}