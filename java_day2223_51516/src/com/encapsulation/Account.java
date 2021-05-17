package com.encapsulation;
//1.Account类要求具有属性:
// 姓名（长度为2位3位或4位)、余额(必须>20、密码(必须是六位)
//如果不满足，则给出提示信息，并给默认值
//2.通过setXxx的方法给Account的属性赋值。
//3.在AccountTest中测试

public class Account {
    private String name;
    private double balance;
    private String password;

    public Account() {
    }

    public Account(String name, double balance, String password) {
        this.setName(name);
        this.setBalance(balance);
        this.setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() == 2 || name.length() == 3 || name.length() == 4){
        this.name = name;
        }else{
            System.out.println("输入的姓名应在在2-4个字符");
            this.name = "佚名";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance > 20){
             this.balance = balance;
        }else{
             System.out.println("账户余额不足,余额应至少为20");
             this.balance = 0;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if( password.length() == 6){
            this.password = password;
        }else{
            System.out.println("密码的个数应该为6位");
            this.password = "000000";
        }

    }
}
