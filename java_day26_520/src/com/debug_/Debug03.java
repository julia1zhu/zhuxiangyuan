package com.debug_;

import java.util.Arrays;

// 演示如何追源码
// 将光标放在某个变量上，可以看到最新的数据
public class Debug03 {
    public static void main(String[] args) {
        int[] arr = {1,-1,10,-20,100};
        //想看看Arrays.sort方法底层实现 ——>Debug 跳入方法体内
        Arrays.sort(arr);
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
    }
}
