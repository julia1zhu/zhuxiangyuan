package com.debug_;
//演示如何直接执行到下一个断点F9
// 小技巧，断点可以在debug过程中，动态的下断点
// 动态下断点支持在自己写的代码，也支持在jdk源码中
// 可以判断这两个断点之间的业务逻辑能否执行
import java.util.Arrays;

public class Debug04 {
    public static void main(String[] args) {
        int[] arr = {1,-1,10,-20,100};
        Arrays.sort(arr);
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
//ctrl + alt +光标向下
        System.out.println("hello100");
        System.out.println("hello200");
        System.out.println("hello300");
        System.out.println("hello400");
        System.out.println("hello500");
    }
}
