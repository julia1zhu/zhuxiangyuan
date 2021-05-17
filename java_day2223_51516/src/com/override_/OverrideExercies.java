package com.override_;

/*1．编写一个Person类，包括属性private (name.age)，构造器、方法say(返回自我介绍的字符串)。
  2  编写一个Student类，继承Person类，增加id、score属性/private，以及构造器，定义say方法(返回自我介绍的信息).
  3. 在main中,分别创建Person和Student对象，调用say方法输出自我介绍。
*/
public class OverrideExercies {
    public static void main(String[] args) {
        Person person = new Person("harry",21);
        System.out.println(person.say());

        Student student = new Student("julia",22,30,98);
        System.out.println(student.say());
    }

}
