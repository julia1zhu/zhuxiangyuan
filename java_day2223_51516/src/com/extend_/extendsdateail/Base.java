package com.extend_.extendsdateail;

public class Base extends TopBase{ // 父类
    // 四个属性
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    // 无参构造器.当有了一个有参构造器，默认的无参构造器便没有了
    public Base() {
        System.out.println("base父类()构造器被调用....");
    }

    public Base(String name,int age){
        System.out.println("父类的有参构造器");
    }
    // 在父类中提供一个public的方法
    public int getN4(){
        return n4;
    }
    // 四个方法
    public void test100() {
        System.out.println("test100");
    }

    protected void test200() {
        System.out.println("test200");
    }

    void test300() {
        System.out.println("test300");

    }

    private void test400(){
        System.out.println("test400");
    }
    public void callTest400(){
        test400();
    }
}
