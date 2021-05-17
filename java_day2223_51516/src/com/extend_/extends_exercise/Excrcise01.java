package com.extend_.extends_exercise;

// 问，main函数中会输出什么？
/*
    a
    b name
    b

 */
public class Excrcise01 {
    public static void main(String[] args) {
        B b = new B();
    }
}

class A {
    A(){
        System.out.println("a");
    }
    A(String name){
         System.out.println("a name");
    }
}

class B extends A{
    B(){
        this("abc");
        System.out.println("b");
    }
    B(String name){
        // super();
        System.out.println("b name");
    }
}
