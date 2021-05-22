package com.homework;

public class Associateprof extends Teacher {
    public Associateprof(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public void introduce() {
        System.out.println(super.getName() + "老师的年龄为" + super.getAge() + "职称是" + super.getPost() +
                "工资为" + super.getSalary()* 1.2);
    }
}
