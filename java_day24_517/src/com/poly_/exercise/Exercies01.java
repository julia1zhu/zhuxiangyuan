package com.poly_.exercise;

// 看看哪些是正确的，哪些是错误的
public class Exercies01 {
    public static void main(String[] args){
       // 基本数据类型强转。数据类型精度小的转换成大的
        double d = 13.4;
        long l = (long)d;
        System.out.println(l);  // 正确  13

        int in = 5;
       //  boolean b = (boolean)in; // 错误，boolean类型不参与类型转换


        Object obj = "Hello";  //正确，向上转型
        String objStr = (String)obj; // String类型指向父类引用，然后向下转型
        System.out.println(objStr);  // 正确 Hello

        Object objPri = new Integer(5); // 正确
        String str = (String)objPri;  // 错误，ClassCastException
        Integer str1 = (Integer)objPri;  //正确

    }
}
