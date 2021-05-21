package com.poly_.polyparameter_;

public class Worker extends Employee {

    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println("普通员工" + getName() + "正在工作");
    }

    @Override
    public double getAnnual() { // 因为普通员工没有其他收入，所以就是重写父类
        return super.getAnnual();
    }
}
