package com.object_;

// 应用实例:判断两个Person对象的内容是否相等，如果两个Person对象的各个属性值都一样,则返回true，
// 反之false.EoualsExercise01.java
public class EqualsExercise01 {
    public static void main(String[] args) {
        Person person = new Person("julia",22,'女');
        Person person1 = new Person("julia",22,'女');
        System.out.println(person.equals(person1));

    }
}

class Person {
    private String name;
    private int age;
    private char gender;

    // 重写Object的equals方法
    public boolean equals(Object obj) {
        // 判断如果比较的两个对象是同一个对象，则直接返回true
        if (this == obj) {
            return true;
        }
        if (obj instanceof Person) {
            Person p = (Person) obj;  // 向下转型，才可以拿到Person类中的各个属性
            if (this.name.equals(p.name) && this.age == p.age
                    && this.gender == p.gender) {// this.name调用的是String类型
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
