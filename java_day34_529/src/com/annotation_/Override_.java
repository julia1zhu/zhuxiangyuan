package com.annotation_;

/**
 * @author 朱香原
 */
public class Override_ {
    public static void main(String[] args) {
    }
}

class Father {
    public void fly() {
        System.out.println("Father fly.");
    }
}
class Son extends Father {
    // 1. @override放在fly方法上，表示子类的fly方法是重写了父类的fly方法
    // 2. 这里如果没写@override，还是重写了fly方法
    // 3. 如果写了@override注解，编译器就会去检查该方法是否真的重写了父类的某个方法。
    //    如果的确重写了，则编译通过，如果没有构成重写，则编译错误
    // 4. @override的定义，
    // 如果发现@interface 表示一个 注解类
    /*
        @Target(ElementType.METHOD)
        @Retention(RetentionPolicy.SOURCE)
        public @interface Override {
        }

     */
    @Override //说明
    public void fly() {
        System.out.println("Son f..");
    }
}