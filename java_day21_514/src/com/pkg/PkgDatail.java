//a.package的作用是声明当前类所在的包，需要放在类的最上面，一个类中最多只有一句package
//b.import指令位置放在package的下面，在类定义前面,可以有多句且没有顺序要求。
// 声明当前类所在的包
package com.pkg;
// 导入一个类
import java.util.Arrays;
import java.util.Scanner;

//类定义
public class PkgDatail {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ints = new int[5];
        Arrays.sort(ints);
    }
}
