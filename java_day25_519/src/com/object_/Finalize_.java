package com.object_;

//演示Finalize的用法
public class Finalize_ {
    public static void main(String[] args) {
        Car bmw = new Car("BMW");
        bmw = null; // 这时创建的car对象就是一个垃圾，垃圾回收器就会（回收）销毁这个对象，其实就是释放这个对象空间
        // 在销毁对象前，会调用这个方法的finalize方法，程序员可以在这个方法中写入自己的一些业务逻辑代码
        // 比如释放资源：数据库连接，或者打开文件
        // 如果程序员不重写finalize,那么就会调用Object类的 finalize, 即默认处理
        // 如果程序员重写了finalize, 就可以实现自己的逻辑
        // 但这个垃圾不一定是马上回收，要根据垃圾回收算法
        System.gc();  // 主动调用垃圾回收器
        System.out.println("程序退出了..."); // 这句话先输出，因为上面那句话不会阻塞程序
    }
}

class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    // 重写finalize方法
    @Override
    protected void finalize() throws Throwable {
        // super.finalize();
        System.out.println("我们销毁汽车" + name);
        System.out.println("释放了某些资源... ");
    }
}