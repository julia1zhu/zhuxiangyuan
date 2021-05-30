package com.enum_;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @author 朱香原
 * 演示自定义枚举类实现
 */
public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season1.AUTUMN);
        System.out.println(Season1.SUMMER);
    }

}

class Season1 {
    private String name;
    private String desc;

    public final static Season1 SPRING = new Season1("春天","温暖");
    public final static Season1 SUMMER = new Season1("夏天","炎热");
    public final static Season1 AUTUMN = new Season1("秋天","凉爽");
    public final static Season1 WINTER = new Season1("冬天","寒冷");

    // 1. 将构造器私有化，目的：防止直接new
    // 2. 去掉setXXX方法，防止属性被修改
    // 3. 在Season1内部，直接创建固定的对象
    // 4. 优化：可以加入final修饰符
    private Season1(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getDesc() {
        return desc;
    }

//    public void setDesc(String desc) {
//        this.desc = desc;
//    }


    @Override
    public String toString() {
        return "Season1{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}