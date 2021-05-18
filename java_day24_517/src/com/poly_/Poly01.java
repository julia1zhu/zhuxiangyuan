package com.poly_;

public class Poly01 {
    public static void main(String[] args) {
        Master master = new Master("julia");
        Dog dog = new Dog("小白");
        Bone bone = new Bone("大棒骨");
        master.feed(dog,bone);

        Cat cat = new Cat("小花");
        Fish fish = new Fish("小黄鱼");
        master.feed(cat,fish);

        System.out.println("==================使用多态实现============================");
        Animal animal = new Dog("小白");
        Food food = new Bone("大棒骨");
        master.feed(animal,food);


        animal = new Cat("小花");
        food = new Fish("小黄鱼");
        master.feed(animal,food);
    }
}
