package com.poly_.polyarr_;

public class PolyArray {
    public static void main(String[] args) {
        //应用实例:现有一个继承结构如下:要求创建1个Person对象、
        // 2个Student 对象和2个Teacher对象，统一放在数组中，并调用每个对象say方法

        Person[] persons = new Person[5];
        persons[0] = new Person("jack",20);
        persons[1] = new Student("mike",20,100);
        persons[2] = new Student("julia",20,87);
        persons[3] = new Teacher("mary",20,25000);
        persons[4] = new Teacher("grace",20,18000);

        // persons[i]编译类型是Person，运行类型是根据实际情况jvm来确定
        for(int i = 0;i < persons.length;i++){
            System.out.println(persons[i].say());// 动态绑定机制
            // 使用类型判断，和向下转型
            if(persons[i] instanceof Student){
                ((Student)persons[i]).study();
            }else if(persons[i] instanceof  Teacher){
                ((Teacher)persons[i]).teach();
            }else if(persons[i] instanceof  Person){

            }else{
                System.out.println("输入的信息有误");
            }
            //  persons[i].teach();  编译类型是Person，不能调用特殊方法
        }


    }
}

