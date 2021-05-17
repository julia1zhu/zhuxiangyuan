package com.Use;

import com.xiaozhu.Dog;
// import com.xiaozhu.Dog; 不能同时引入两个，因为会引起混淆

public class Test {
    public static void main(String[] args) {
        // 这里没有写包名，因为在类上已经省略了
        Dog dog = new Dog();
        System.out.println(dog);// com.xiaozhu.Dog@1540e19d

        // 明确告诉是小明包的类
        com.xiaoming.Dog dog1 = new com.xiaoming.Dog();
        System.out.println(dog1);// com.xiaoming.Dog@677327b6
    }


}
