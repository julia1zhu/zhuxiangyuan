package com.extend_.extendstheory;

/**
 * 讲解继承的本质
 */
public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.name);// 要按照查找关系来返回信息
        // 1）首先看子类是否有该属性
        // 2）如果子类有这个属性并且可以访问，则返回信息
        // 3）如果子类没有这个属性，就向上找，看父类有没有这个属性
        // 如果父类有这个属性并且可以访问，则返回属性
        // 如果有这个属性但是不可以访问，那么就报错，停止向上查找
        // 4）如果父类没有就按照3）的规则，继续找上级父类，直到object类
        //System.out.println(son.age);
        System.out.println(son.getAge());
        System.out.println(son.hobby);

    }
}
class GrandPa {
    String name ="大头爷爷";
    String hobby ="旅游";
}
class Father extends GrandPa{
    String name = "大头爸爸";
    private int age = 39;

    public int getAge() {
        return age;
    }
}
class Son extends Father {
    String name ="大头儿子";
}
