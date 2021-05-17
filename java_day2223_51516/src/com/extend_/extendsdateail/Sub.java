package com.extend_.extendsdateail;

//ctrl + H 可以看到类的继承关系
public class Sub extends Base {// 子类
    public Sub(){ //构造器
      //  super(); 写或者不写代表默认调用父类的无参构造器
        super("tom",23); //调用父类构造器完成初始化
        System.out.println( "sub子类()构造器被调用....");
    }

    public Sub(String name){
        super("jerry",25);
        System.out.println("子类Sub（String name）构造器被调用");
    }

    public void sayOk(){
    //我们发现父类的非private属性和方法都可以访问
        System.out.println(n1 + " " + n2 + " " + n3 + " ");
        test100();
        test200();
        test300();
         // test400();  错误
        // 通过父类提供公共的方法去访问
        System.out.println(getN4());
        callTest400();
    }
}
