// 12.创建一个Employee类,属性有(名字， 性别，年龄，职位，薪水)，提供3个构造方法
// 可以初始化(1)(名字，性别，年龄，职位，薪水),(2)(名字，性别，年龄)(3)(职位，薪水)
// 要求充分复用构造器


class HomeWork12{
	public static void main(String[] args){
		
		
	}
}

class Employee{
	String name;
	char gender;
	int age;
	String job;
	double sal;
	
	public Employee(String pos,double sal){
		this.job = job;
		this.sal = sal;
	}
	
	public Employee(String name,char gender,int age){
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public Employee(String name,char gender,int age,String job,double sal){
		this(name,gender,age);
		// 不能有以下用法，因为在构造器中调用另一个构造器只能放在第一句
		// this(job,sal);
		this.job = job;
		this.sal = sal;
		
		
		/*
			this.name = name;
			this.gender = gender;
			this.age = age;
			this.pos = pos;
			this.sal = sal;
		*/
	}
	
	
	
	
	
	
	
	
}