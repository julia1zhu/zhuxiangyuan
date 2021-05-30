package com.enum_;

/**
 * @author 朱香原
 * 演示enum关键字实现枚举类
 */
public class Enumeration03 {
    public static void main(String[] args) {
        System.out.println(Season2.SPRING);
        System.out.println(Season2.Winter);
    }
}

enum  Season2 {


//    public final static Season2 SPRING = new Season2("春天","温暖");
//    public final static Season2 SUMMER = new Season2("夏天","炎热");
//    public final static Season2 AUTUMN = new Season2("秋天","凉爽");
//    public final static Season2 WINTER = new Season2("冬天","寒冷");

    //  使用enum关键字来实现枚举类
    // 1．使用关键字enum替代class
    // 2. public static final Season SPRING = new Season("春天"，"温暖")直接使用
    // SPRING("春天"，“温暖")解读 常量名(实参列表)
    // 3. 如果有多个常量（对象），使用,号间隔即可
    // 4. 如果使用enum来实现枚举，要求将定义常量对象，写在前面
    // 5. 如果我们使用的是无参构造器创建常量对象，则参数列表和小括号都可以省略
    SPRING("春天","温暖"),Winter("冬天","寒冷"),
    SUMMER("夏天","炎热"),What;
    private String name;
    private String desc;

    private Season2(){ // 无参构造器

    }
    private Season2(String name, String desc) {
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