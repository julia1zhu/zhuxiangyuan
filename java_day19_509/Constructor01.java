/*一个需求:前面我们在创建人类的对象时，是先把一个对象创建好后，
	再给他的年龄和姓名属性赋值，
	如果现在我要求，在创建人类的对象时，就直接指定这个对象的年龄和姓名,该怎么做?
	这时就可以使用构造器。
*/

public class Constructor01{
	public static void main(String[] args){
		// 当我们new一个对象时，直接通过构造器制定名字和年龄
		Person p1 = new Person("smith",80);
		System.out.println("p1对象的信息如下");
		System.out.println("p1对象的名字" + p1.name);
		System.out.println("p1对象的年龄" + p1.age);
	}
}

class Person {
	String name;
	int age;
	
	// 构造器
	/* 1.构造器没有返回值，也不能写void
	   2.构造器名称是Person，和类名一样
	   3.构造器的形参列表规则和成员方法一样
	 */
	 
	public Person(String pName,int pAge){
		name = pName;
		age = pAge;
		System.out.println("构造器被调用，完成对象属性的初始化");
	}
	
}