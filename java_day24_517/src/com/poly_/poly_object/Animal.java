package com.poly_.poly_object;

public class Animal {
    public void cry(){
        System.out.println("Animal cry() 动物在叫");
    }
}

class Cat extends Animal{

    public void cry(){
        System.out.println("Cat cry() 小猫喵喵喵");
    }

}

class Dog extends Animal{
    public void cry(){
        System.out.println("Dog cry() 小狗汪汪汪");
    }
}
