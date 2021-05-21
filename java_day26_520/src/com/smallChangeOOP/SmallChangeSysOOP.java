package com.smallChangeOOP;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 该类是完成零钱通各个功能的类
 * 使用OOP（面向对象编程）
 * 将各个功能对应一个方法
 */
public class SmallChangeSysOOP {
    //定义相关的变量
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";

    //2．完成零钱通明细
    //思路，(1)可以把收益入账和消费，保存到数组
    //   （2）可以使用对象
    //    (3）简单的话可以使用String拼接

    String details = "=================零钱通明细==================";

    //3. 完成收益入账，完成功能驱动程序员增加新的变化和代码
    // 定义新的变量
    double money = 0;
    double balance = 0;
    Date date = null;   // java.util.lang类型，显示当前时间
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm"); // 可以用于日期格式化的

    // 4. 消费
    // 定义新变量，保存消费的原因
    String note = "";


    // 显示菜单，并且可以选择
    public void showMenu(){
        do{
            System.out.println("\n==============零钱通菜单======================");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退出");
            System.out.println("请选择1-4");
            key = scanner.next();

            // 使用switch分支
            switch(key){
                case "1" :
                   this.details();
                    break;
                case "2" :
                    this.income();
                    break;
                case "3" :
                    this.pay();
                    break;
                case "4" :
                    this.exit();
                    break;
                default:
                    System.out.println("菜单选择有误，请重新选择");
            }
        }while(loop);
    }

    // 零钱通明细
    public void details(){
        System.out.println(details);
    }

    // 收益入账
    public void income(){
        System.out.print("收益入账金额");
        money = scanner.nextDouble();
        // money的值范围应该校验,找出不正确的金额条件，给出提示，就直接break
        // 这种找出不正确的例子，会比写正确情况的简介很多。因为这种情况应该写成if——else，但是如果是不正确的情况有
        // 几种，那么分支就会变多
        if(money <= 0){
            System.out.println("收益入账金额范围需要在大于0" );
            return;
        }
        balance += money;
        //拼接收益入账信息到details
        date = new Date();// 获取当前日期
        details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;

    }

    // 消费
    public void pay(){
        System.out.println("消费金额");
        money = scanner.nextDouble();
        // money的值范围应该校验
        if(money <= 0 || money > balance){
            System.out.println("消费金额范围需要在0-" + balance);
            return;
        }
        System.out.println("消费说明:");
        note = scanner.next();
        balance -= money;
        //拼接消费信息到details
        date = new Date();// 获取当前日期
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    public void exit(){
        //用户输入4退出时，给出提示"你确定要退出吗? y/n"，必须输入正确的y/n
        // 否则循环输入指令，直到输入y或者n
        //思路： (1)定义一个变量 choice，接受用户的输入
        //       (2)使用while + break来处理接收用户输入的y/n
        //      （3）退出while后，再判断choice是y还是n，就可以决定是否退出
        //      （4）建议一段代码，完成一个小功能，不混在一起
        String choice = "";
        while(true){ // 要求用户必须输入y/n，否则就一直循环
            System.out.println("你确定要退出吗? y/n");
            choice = scanner.next();
            if("y".equals(choice) || "n".equals(choice)){
                break;
            }
        }
        // 当用户退出while,进行判断
        if(choice.equals("y")){
            loop = false;
        }
    }

}
