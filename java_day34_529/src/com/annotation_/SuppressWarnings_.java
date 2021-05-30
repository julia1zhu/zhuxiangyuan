package com.annotation_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 朱香原
 */
public class SuppressWarnings_ {
    // 1. 当我们不希望看到这些警告的时候，可以使用SuppressWarning注解来抑制警告信息
    // 2. 在大括号中，可以写入你希望抑制（不显示）警告信息
    // 3. 可以指定的警告类型有非常duo
    // 4. 关于SuppressWarnings作用范围是和放置的位置相关
    //    @SuppressWarnings放在main方法，那么抑制警告的范围就是main方法
    // 5. 通常我们可以放置具体的语句，方法，类，为了一劳永逸，可以直接放在类上
    // 6. 查看源码
    //   (1) 放置的位置就是TYPE,FIELD,METHOD,PARAMETER,CONSTRUCTOR,LOCAL_VARIABLE
    /*  （2）该注解类有数组 String[] value() 设置一个数组比如{"unchecked","unused"}

        @Target({TYPE,FIELD,METHOD,PARAMETER,CONSTRUCTOR,LOCAL_VARIABLE})
        @Retention(RetentionPolicy.SOURCE)
        public@interfaceSuppressWarnings{

            String[]value();
        }

     */
    @SuppressWarnings({"unchecked","unused"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("");
        list.add("");
        list.add("");
        int i;
        System.out.println(list.get(1));

    }

    public void f1() {
        List list1 = new ArrayList();
        list1.add("");
        list1.add("tom");
        list1.add("jerry");
        int a;
        System.out.println(list1.get(2));
    }
}
