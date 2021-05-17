package com.extend_.extends_exercise;
/*
编写Computer类，包含CPU、内存、硬盘等属性,getDetails方法用于返回Computer的详细信息
编写PC子类，继承Computer类，添加特有属性【品牌brand】
编写NotePad子类，继承Computer类，添加特有属性【演示color)
编写Exercies03类，在main方法中创建PC和NotePad对象，分别给对象中特有的属性赋值，以及从Computer类继承的属性赋值，并使用方法并打印输出信息。
 */
public class Exercise03 {
    public static void main(String[] args) {
        PC pc = new PC();
        NotePad notePad = new NotePad();
        pc.CPU = "Intel";
        pc.memory = "256G";
        pc.disk = "4T";
        pc.brand = "lenevo";
        System.out.println(pc.getDetails());

        System.out.println("=============================================");
        notePad.CPU = "ios";
        notePad.memory = "128G";
        notePad.disk = "2T";
        notePad.color = "pink";
        System.out.println(notePad.getDetails());

    }
}

class Computer{
    String CPU;
    String memory;
    String disk;

    public String getDetails(){
        return CPU + " " + memory + " " + disk;
    }

}

class PC extends Computer{
    String brand;
}

class NotePad extends Computer{
    String color;
}
