package com.override_;

public class Override01 {
    public static void main(String[] args) {
    // 演示方法重写的情况
        Dog dog = new Dog();
        dog.cry();
    }
}


// Dog是Animal子类
// 两个类中方法定义形式一样（名称、返回类型、参数）
class Animal{
    public void cry(){
        System.out.println("动物叫，，，");
    }

    // 子类返回类型是父类返回类型的子类
    public Object m1(){
        return null;
    }
}

class Dog extends Animal{
    public void cry(){
        System.out.println("小狗汪汪叫");
    }

    public String m1(){
        return null;
    }
}