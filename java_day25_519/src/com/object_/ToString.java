package com.object_;

public class ToString {
    public static void main(String[] args) {
        /*
        Object的toString方法的源码
       （1）getClass().getName() ：类的全类名（包名+类名）
       （2） Integer.toHexString(hashCode()：将对象的hashcode值转换为16进制
        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
         */
        Monster monster = new Monster("小妖怪","巡山",1000);
        System.out.println(monster.toString());//
        //重写之前：默认使用Object的toString方法  com.object_.Monster@1540e19d
        //重写之后：输出属性值   Monster{name='小妖怪', job='巡山', sal=1000.0}

        //当直接输出一个对象时，toString 方法会被默认的调用,没有重写，输出的是Object的，重写后，输出的是重写后的方法
        System.out.println(monster);// 就会默认调用 monster.toString()

    }

}

class Monster {
    private String name;
    private String job;
    private double sal;

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }

    // 重写toString方法，输出对象的属性
    // 使用快捷键即可 alt + insert ——> toString
    @Override
    public String toString() { //重写后，一般是把属性值输出，也可以自己定制
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }
}