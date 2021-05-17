package com.pkg;

import com.modifier.A;

public class Test {
    public static void main(String[] args) {
        A a = new A();

        // 在不同包里，只能访问public修饰的属性或方法
        System.out.println(a.n1);
        a.m1(); // 不能访m2,m3,m4
    }
}
