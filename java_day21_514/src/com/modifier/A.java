package com.modifier;

public class  A {
    // 四个属性,分别使用不同的访问修饰符来修饰
    public int n1 = 100;
    protected int n2 =50;
    int n3 = 150;
    private int n4 = 29;

    // 在同一个类中可以访问被public、protecte、默认修饰属性或访问，还有private修饰符修饰的方法
    public void m1(){
        System.out.println(n1 + " " + n2 + " " + n3 +  " " + n4);
    }
    protected void m2(){
        System.out.println();
    }
    void m3(){}
    private void m4(){}

    // m1(),m2(),m3(),m4()   在这里应该可以访问，但是语法出现了问题

}
