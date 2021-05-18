package com.poly_.poly_datail;

public class PolyDetail03 {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof BB);
        System.out.println(bb instanceof AA);

        // aa的编译类型是AA，运行类型是BB
        AA aa = new BB();
        System.out.println(aa instanceof AA);
        System.out.println(aa instanceof BB);


        Object o = new Object();
        System.out.println(o instanceof AA);
        String str = "julia";
        System.out.println(str instanceof Object);


    }
}

class AA {

}

class BB extends AA {

}