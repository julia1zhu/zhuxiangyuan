package com.poly_.poly_datail;

public class PolyDetail {
    public static void main(String[] args) {

        // 向上转型,父类的引用指向了子类的对象
        Animal animal = new Cat();

        // 可以调用父类中的所有成员(需遵守访问权限)，不能调用子类中特有成员;
        // 因为在编译阶段，能调用哪些成员，是由编译类型来决定
        //  animal.catchMouse();错误，

        // 最终的运行效果还要看子类的具体实现，
        // 即调用方法时，按照从子类开始查找方法开始调用，规则和前面将的方法调用一直
        // 其实就是子类的重写的方法
        animal.eat(); //猫吃鱼
        animal.run();
        animal.show();
        animal.sleep();

        // 希望可以调用Cat的catchMouse方法
        // 多态的向下转型

        // 编译的类型是Cat,运行类型是Cat
        Cat cat = (Cat)animal;
        cat.catchMouse();

        //要求父类的引用必须指向的是当前目标类型的对象
        // 在此之前，animal指向的是Cat类，生成了一个新的引用，也指向的是Cat类
        // 下面操作，会将原来是猫转成狗
        Dog dog = (Dog)animal;// 编译不会报错，但是运行会出现类异常

    }
}
