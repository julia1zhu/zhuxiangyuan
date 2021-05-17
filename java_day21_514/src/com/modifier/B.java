package com.modifier;

public class B {
    public void say(){
        A a = new A();

        // 在同一个包下，可以访问public,protected,和默认修饰属性或方法，不能访问private
        System.out.println(a.n1 + " " + a.n2 + " "  + a.n3);
        a.m1();
        a.m2();
        a.m3();
    }
}
