package com.extend_.extendsdateail;

public class ExtendsDetail {
    public static void main(String[] args) {
        System.out.println("===============第一个对象，采用默认构造函其初始化=======================");
        Sub sub = new Sub();
        System.out.println("=============第二个对象，采用有参构造器初始化对象==============================");
        Sub julia = new Sub("julia");
        sub.sayOk();
    }
}
