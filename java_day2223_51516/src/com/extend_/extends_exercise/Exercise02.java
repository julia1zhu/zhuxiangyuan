package com.extend_.extends_exercise;

// main方法中输出的是什么？
/*
我是A类
haha 我是B类的有参构造
hello 我是C类的有参构造
我是C类的无参构造
 */
public class Exercise02 {
    public static void main(String[] args) {
        C2 c2 = new C2();
    }
}

class A2 {
    public A2(){
        System.out.println("我是A类");
    }
}
class B2 extends A2{
    public B2(){
        System.out.println("我是B类的无参构造");
    }
    public B2(String name){
        System.out.println(name + "我是B类的有参构造");
    }
}
class C2 extends B2 {
    public C2() {
        this("hello");
        System.out.println("我是c类的无参构造");
    }

    public C2(String name) {
        super("haha");
        System.out.println(name + "我是c类的有参构造");
    }
}