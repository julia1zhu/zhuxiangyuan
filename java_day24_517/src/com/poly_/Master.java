package com.poly_;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 使用多态机制，可以统一管理主人喂食问题
    public void feed(Animal animal,Food food){
        System.out.println("主人" + name + "给" + animal.getName() + "喂" + food.getName());


    }
//    // 主人给小狗喂食骨头
//    public void feed(Dog dog, Bone bone){
//        System.out.println("主人" + name + "给" + dog.getName() + "喂" + bone.getName());
//    }
//
//    // 主人给小猫喂食鱼
//    public void feed(Cat cat, Fish fish){
//        System.out.println("主人" + name + "给" + cat.getName() + "喂" + fish.getName());
//    }

}
