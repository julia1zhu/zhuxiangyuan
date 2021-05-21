package com.debug_;

//1.使用断点调试的方法，追踪下一个对象创建的过程。Person [name , age,构造器.]
//2.我们使用断点调试，查看动态绑定机制的如何工作
public class DebugExercise01 {
    public static void main(String[] args) {
        //创建对象的流程
        // （1） 加载Person类信息
        //  (2)  初始化  2.1 默认初始化  2.2 显示初始化  2.3 构造器初始化
        // （3）  返回对象地址
        Person person = new Person("julia",22);
        System.out.println(person);
    }
}

class  Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
