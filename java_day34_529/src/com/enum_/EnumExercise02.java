package com.enum_;

/**
 * @author 朱香原
 */


/*
    1)声明Week枚举类,其中包含星期一至星期日的定义;
    MONDAY, TUESDAY, WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
    2)使用values返回所有的枚举数组,并遍历，输出左图效果

 */
public class EnumExercise02 {
    public static void main(String[] args) {
        Week[] week = Week.values();
        for (Week values:week) {
            System.out.println(values);
        }
    }
}

enum Week {
    MONDAY("星期一"),TUSEDAY("星期二"),WEDNSDAY("星期三"),THURSDAY("星期四"),
    FRIDAY("星期五"),SATURDAY("星期六"),SUNDAY("星期日");
    private String name;

    private Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name ;
    }
}