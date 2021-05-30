package com.enum_;

/**
 * @author 朱香原
 * 演示Enum类的各种方法的使用
 */
public class EnumerationMethod {
    public static void main(String[] args) {
        // 使用Season4枚举类，来演示各种方法
        Season4 autumn = Season4.AUTUMN;
        Season4 summer = Season4.SUMMER;
        // 1. name():输出枚举对象的名称
        System.out.println(autumn.name());
        // 2. ordinal()：输出该枚举对象的次序/ 编号，从0开始
        // AUTUMN枚举对象是第三个，因此输出 2
        System.out.println(autumn.ordinal());  // 0
        //3. 从反编译可以看到values方法，返回Season4[]
        Season4[] value = Season4.values();
        for (Season4 season:value){ // 增强for循环
            // 执行流程是 依次从数组中取出数据，赋给分号前变量
            // 如果取出完毕，则退出for循环
            System.out.println(season);
        }
       // 4. valueOf():将字符串转换成枚举对象，要求字符串必须为已有的常量名,否则报异常
        // 执行流程
        // 1. 根据输入的"AUTUMN"到Season4的枚举对象去查找
        // 2，如果找到了，则返回，如果没有找到，就报错
        Season4 autumn1 = Season4.valueOf("AUTUMN");
        System.out.println(autumn1);
        System.out.println(autumn == autumn1);

        // 5.compareTo():比较两个枚举常量，比较的就是位置号
        // 1. 就是把Season4.AUTUMN枚举对象的编号和Season4.SUMMER的编号进行比较
        System.out.println(Season4.AUTUMN.compareTo(Season4.SUMMER));
        /*
         public final int compareTo(E o) {
            ....
        return self.ordinal - other.ordinal;
        }

         */
    }
}

enum  Season4 {
    SPRING("春天","温暖"),SUMMER("夏天","炎热"),
    AUTUMN("秋天","凉爽"),Winter("冬天","寒冷");
    private String name;
    private String desc;

    private Season4(){ // 无参构造器

    }
    private Season4(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season1{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}