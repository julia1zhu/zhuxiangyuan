package com.poly_.poly_object;



/**
 * 对象的多态
 */
public class PolyObject {
    public static void main(String[] args) {

        // animal编译类型是Animal，运行类型是Dog
        // 编译就是javac java文件→.class文件，运行就是java命令
        Animal animal = new Dog();
        animal.cry();  // 因为运行到该句话的时候，animal的运行类型是Dog，所以cry是Dog的cry

        ///animal 编译类型 Animal ,运行类型是 Cat
        animal = new Cat();
        animal.cry();

    }

}
