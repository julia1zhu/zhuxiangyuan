package com.extend_.improve;


public class Test {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name  = "小明2";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(69);
        pupil.showInfo();

        System.out.println("=================================================");
        Graduate graduate = new Graduate();
        graduate.name = "李华2";
        graduate.age = 20;
        graduate.testing();
        graduate.setScore(95);
        graduate.showInfo();
    }
}
