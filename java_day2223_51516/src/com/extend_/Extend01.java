package com.extend_;
// 我们编写了两个类，一个是Pupil类(小学生)，一个是Graduate(大学毕业生).
// 问题:两个类的属性和方法有很多是相同的，怎么办?

public class Extend01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name  = "小明";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(69);
        pupil.showInfo();

        System.out.println("=================================================");
        Graduate graduate = new Graduate();
        graduate.name = "李华";
        graduate.age = 20;
        graduate.testing();
        graduate.setScore(95);
        graduate.showInfo();
    }
}
