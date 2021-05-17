public class ConstructorDetail{
	public static void main(String[] args){
		Person p1 = new Person("king",40);
		Dog d1 = new Dog("小白",3);
		//   Dog d1 = new Dog();  当默认无参构造器被覆盖后，就不能用这种方式创建对象了
		//   如果还想继续使用，除非显示的定义一下
		
		// 构造方法一般不使用成员方法调用那种方法  例如d1.Person（）；  不这么用
	}
}

class Person {
	String name;
	int age;
	
	// 1. 一个类可以定义多个不同的构造器，即构造器重载
	
	// 第一个构造器  指定名字和年龄
	public Person (String pName,int pAge){
		name = pName;
		age = pAge;
	}
	// 第二个构造器   指定名字
	public Person(String pName){
		name = pName;
		
	}
	// 第三个构造器  指定年龄
	public Person (int pAge){
		age = pAge;
	}
}

class Dog {
	String name;
	int age;
	/*  如果程序员没有定义构造器，系统会自动给类生成一个默认无参构造器(也叫默认构造器)/*
		
		默认构造器Dog() {
				}
				
	*/
	
	//一旦定义了自己的构造器,默认的构造器就覆盖了，就不能再使用默认的无参构造器,
	//除非显式的定义一下,即: DogO)0写(这点很重要)1

	
	public Dog(String pName,int pAge){
		name = pName;
		age = pAge;
	}
	
	
}