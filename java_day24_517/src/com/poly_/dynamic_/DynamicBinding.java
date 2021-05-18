package com.poly_.dynamic_;

public class DynamicBinding {
    public static void main(String[] args) {
        // a的编译类型是A，运行类型是B
        A a = new B();
        System.out.println(a.sum());
        // 1. 40   2.20 + 10
        System.out.println(a.sum1()); //1. 30  2.10 + 10
    }
}

class A {
    public int i = 10;
    // 动态绑定
    public int sum(){
        return getl() + 10; //20 + 10
    }
    public int sum1(){
        return i + 10;  // 10 + 10
    }
    public int getl(){ // 父类的getl方法，但是绑定的是运行类型里面的方法
        return i;
    }
}

class B extends A{
    public int i = 20;

//    public int sum() {
//        return i + 20;
//    }

    public int getl(){
        return i;
    }
//    public int sum1(){
//        return i + 10;
//    }
}
