package com.enum_;

/*
    创建Season对象有如下特点
    1.季节的值是有限的几个值(spring, summer, autumn, winter).
    2.只读,不需要修改。

 */
public class Enumration01 {
    public static void main(String[] args) {
        // 使用

        Season spring = new Season("春天","生机");
        Season summer = new Season("夏天", "炎热");
        Season autume = new Season("秋天", "凉爽");
        Season winter = new Season("冬天", "寒冷");
        autume.setName("白天");
        // 因为对于季节而言，他的对象具体的值是固定的四个，不会有更多
        // 按这个设计思路，不能体现季节是固定的四个对象
        // 因此这样的设计不好=== 枚举类
        Season other = new Season("蓝天","高远");

    }
}


class Season {
    private String name;
    private String desc;

    public Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}