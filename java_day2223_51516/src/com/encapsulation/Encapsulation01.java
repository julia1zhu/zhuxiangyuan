package com.encapsulation;

//请大家看一个小程序,不能随便查看人的年龄,工资等隐私，并对设置的年龄进行合理的验证。
// 年龄合理就设置，否则给默认
//年龄必须在1-120,年龄，工资不能直接查看，name的长度在2-6字符之间

public class Encapsulation01 {
    public static void main(String[] args) {
        // 如果要使用快捷键alt+r,需要先配置主类
        // 第一次，使用鼠标点击形式运行程序，之后就可以使用快捷键运行
        Person p1 = new Person();
        p1.setName("julia");
        p1.setAge(3000);
        p1.setSalary(30000);
        System.out.println(p1.info());

        // 如果我们使用构造器指定属性
        Person smith = new Person("smith", 2000, 40000);
        System.out.println(smith.info());
    }
}

class Person {
    public String name; // 名字公开
    private int age;  //年龄私有
    private double salary;

    //构造器
    public Person() {
    }

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        // 我们可以将set方法写在构造器中，这样仍然可以验证
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    // 自己写setXxx和gerXxxt不方便，使用快捷键，和生成构造器方法一样
    public String getName() {
        return name;
    }

    public void setName(String name) {
        // 加入对数据的校验，增加了业务逻辑
        if(name.length() >=2 && name.length() <= 6){
            this.name = name;
        }else{
            System.out.println("名字的长度不对，需要（2-6）个字符");
            this.name = "无名氏";
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 1 && age <= 100){
            this.age = age;
        }else{
            System.out.println("年龄需要在1-120之间");
            this.age = 18;// 给一个默认年龄
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    // 写一个方法，返回属性信息
    public String info(){
        return name + " " + age + " " + " salary";
    }
}
