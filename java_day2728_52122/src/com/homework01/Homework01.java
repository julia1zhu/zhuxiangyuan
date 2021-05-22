package com.homework;

// 1.定义一个Person类{name, age, job},初始化Person对象数组，有3个person对象，
// 并按照 age从大到小进行排序,提示，使用冒泡排序

import java.util.Arrays;

public class Homework01 {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person("juliajulia", 22, "学生");
        persons[1] = new Person("harry", 45, "老师");
        persons[2] = new Person("grace", 25, "医生");

        // 输出当前对象数组
        for(int i = 0;i < persons.length;i++){
            System.out.println(persons[i]);
        }


//        //按年龄用冒泡排序处理
        Person temp = null;  //临时变量，用于交换
//        for(int j = 1;j < persons.length;j++){
//            for(int i = 0;i < persons.length-j;i++){
//                if(persons[i].getAge() < persons[i+1].getAge()){
//                    temp = persons[i];
//                    persons[i] = persons[i+1];
//                    persons[i+1] = temp;
//                }
//            }
//        }

        // 按照名字长度从小到大排列,如果名字长度一样，则按照年龄从小到大排序
        for(int j = 1;j < persons.length;j++){
            for(int i = 0;i < persons.length-j;i++){
                if(persons[i].getName().length() > persons[i+1].getName().length()){
                    temp = persons[i];
                    persons[i] = persons[i+1];
                    persons[i+1] = temp;
                }else if(persons[i].getName().length() == persons[i+1].getName().length()){
                    if(persons[i].getAge() > persons[i+1].getAge()){
                        temp = persons[i];
                        persons[i] = persons[i+1];
                        persons[i+1] = temp;
                    }
                }
            }
        }

        //输出排序对象数组
        for(int i = 0;i < persons.length;i++){
            System.out.println(persons[i]);
        }

    }

}


class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
