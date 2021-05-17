package com.super_;

public class B extends A{
    public int n1 = 88;
    //访问父类的属性，但不能访问父类的private属性〔案例]super.属性名
    public void hi(){
        System.out.println(super.n1 + " " + super.n2 + " " + super.n3);
        System.out.println(n1 + n2 + n3);
    }
    public void cal(){
        System.out.println("B类的cal方法");
    }
    public void sum(){
        System.out.println("B类的sum方法");
        // 希望调用父类A的cal方法
        // 因为子类B没有cal方法，因此可以使用下列三种方式调用
        cal();
        //找cal方法时，顺序是，先找本类，如果有，则调用
        // 如果没有，则找父类，如果父类有且可以调用则调用
        // 如果父类没有，则继续向上寻找
        // 注意：如果在查找方法过程中，找到了但是不能访问，报错
        //       如果在查找方法过程中，没有找到，则提示方法不存在
        System.out.println("===================================================");
        this.cal();  //等价于cal
        System.out.println("======================================================");
        super.cal(); // 找父类,即使本类有cal()方法，也是调用父类，除了不找子类，其他规则一样

        // 演示访问属性的规则
        System.out.println(n1);
        System.out.println(this.n1);
        System.out.println(super.n1);
    }



    //访问父类的方法，但不能访问父类的private方法〔案例]super.方法名
    public void ok(){
        super.test100();
        super.test200();
        super.test300();
    }

    // 访问父类的构造器：super(参数列)
}
