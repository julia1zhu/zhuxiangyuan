package com.pkg;
// 建议，使用什么类，就引入什么类
//import java.util.Scanner;  //表示只引入java.util包下的Scanner类
//import java.util.*;  //表示将java.util包下的所有类都引入
import java.util.Arrays;

public class Import01 {
    // 使用系统提供Arrays完成数组排序
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4};
//        系统提供了相关的类，可以进行排序
        Arrays.sort(arr);
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

}
