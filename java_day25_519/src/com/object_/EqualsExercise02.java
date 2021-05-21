package com.object_;

public class EqualsExercise02 {
    public static void main(String[] args) {
        Person1 p1 = new Person1();
        p1.name = "hspedu";
        Person1 p2 = new Person1();
        p2.name = "hspedu";

        System.out.println(p1 == p2);  // false,比较是否为一个对象
        System.out.println(p1.name.equals(p2.name)); //true,字符串类型已经进行了重写了
        System.out.println(p1.equals(p2)); // false 因为并未重写方法，所以比较的是两个对象地址值

        String s1 = new String("asdf");
        String s2 = new String("asdf");

        System.out.println(s1.equals(s2)); //true String类有重写，所以比较的是内容
        System.out.println(s1 == s2); //false，比较两个对象地址

    }

}


class Person1 {//类
     public String name;
}
