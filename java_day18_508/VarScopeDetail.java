public class VarScopeDetail{
	public static void main(String[] args){
		Person p1 = new Person();
		p1.say();
		T t1 = new T();
		t1.test(); // 第一种跨类访问对象属性的方式
		t1.test2(p1); // 第二种跨类访问对象属性的方式
	}
}


class T {
	//	全局变量/属性:可以被本类使用，或其他类使用(通过对象调用)
	public void test(){
		Person p2 = new Person();
		System.out.println(p2.name);
	}
	
	public void test2(Person p){
		System.out.println(p.name);
	}
}


class Person {
	
	private int age = 20; // 属性可以加修饰符 public protected private...
	
	String name = "Tom";
	public void say(){
		String name = "Jerry";
		System.out.println("name=" + name);
	}
	
	
	public void hi(){
		String address = "北京";
		// String address = "上海";  错误，重复定义
		String name = "julia";
	}
}