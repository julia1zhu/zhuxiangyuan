package com.poly_.polyparameter_;

/*
定义员工类Employee，包含姓名和月工资[private]，以及计算年工资getAnnual的方法。
普通员工和经理继承了员工，经理类多了奖金bonus属性和管理manage方法，普通员工类多了work方法.
普通员工和经理类要求分别重写getAnnual方法
测试类中添加一个方法showEmpAnnual(Employee e)，实现获取任何员工对象的年工资,并在main方法中调用该方法[e.getAnnual0]
测试类中添加一个方法，testWork,如果是普通员工，则调用work方法，如果是经理，则调用manage方法

 */
public class PolyParameter {
    public static void main(String[] args) {
        Worker tom = new Worker("tom", 3500);
        Manager jerry = new Manager("jerry", 15000,5000);
        PolyParameter polyParameter = new PolyParameter();
        polyParameter.showEmpAnnual(tom); // 动态绑定，运行类型
        polyParameter.showEmpAnnual(jerry);
    }

    public void showEmpAnnual(Employee e){
        System.out.println(e.getAnnual());
    }

    public void testwork(Employee e){
        if(e instanceof Worker){
            ((Worker) e).work();
        }else if(e instanceof Manager){
            ((Manager) e).manage();
        }

    }

}
