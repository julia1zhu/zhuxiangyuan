public class ThisDetail{
	public static void main(String[] args){
		
		T t1 = new T();
		t1.f2();
		T t2 = new T();
		t2.f3();

	}
}

class T {
	
	String name = "julia";
	int age = 22;
	
	public void f3(){
		String name = "Smith";
		// 根据就近原则，如果局部变量里面有age和name的值，那么就不会输出属性中的值了
		System.out.println("name = " + name + " age = " + age);
		
		// 一定是输出属性中的名字和年龄
		System.out.println("name = " + this.name + " age = " + this.age);
		
	}

	
	// 细节： 访问构造器语法:this(参数列表)   
	// 注意只能在构造器中访问另外一个构造器
	
	// 注意：访问构造器语法：this（参数列表）：必须放在第一条语句
	public T(){
		this("julia",22);
		System.out.println("T()构造器");
	}
	
	public T(String name,int age){
		System.out.println("T(String name,int age)构造器");
		
	}
	
	
	//细节： 访问成员方法的语法:this.方法名(参数列表);
	public void f1(){
		System.out.println("f1()方法");
	}
	
	public void f2(){
		System.out.println("f2()方法");
		// 调用本类的f1
		f1();         // 第一种方式
		this.f1();    // 第二种方式
	
		
	}
	
	
	
	
	
	
	
	
}