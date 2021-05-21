package com.poly_.polyparameter_;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // 得到年工资的方法
    public double getAnnual() {
        return 12 * salary;
    }

    public String getName() {
        return name;
    }

}
