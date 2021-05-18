package com.poly_;

/**
 * 方法的多态
 */
public class PolyMethod {
    public static void main(String[] args) {
        // 方法重载表示多态
        A a = new A();
        // 这里传入不同的参数，就会调用不同的sum方法，就体现多态
        System.out.println(a.sum(3,5,7));
        System.out.println(a.sum(7,8));

        B b = new B();
        b.say();
        a.say();
    }
}

class B{
    public void say() {
        System.out.println("B say()方法被调用...");
    }
}
class A extends B {
    public int sum(int n1, int n2){
        return n1 + n2;
    }
    public int sum(int n1,int n2,int n3){
        return n1 +n2 + n3;
    }
    public void say() {
        System.out.println("A say()方法被调用");
    }
}
