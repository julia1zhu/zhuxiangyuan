public class MethodDetail02{
	public static void main(String[] args){
		// 1.同一个类中的方法调用:直接调用即可。比如print(参数);
		// 2.跨类中的方法A类调用B类方法:需要通过对象名调用。
		// 比如对象名.方法名(参数);案例演示: B类sayHello调用print()
		A a = new A();
		a.sayOK();
		a.m1();
		
		
		
	}
}
class A{
	public void print(int n){
		System.out.println("print方法被调用 n=" + n);
	}
	
	public void sayOK(){   // sayok调用，直接调用，不需要创建对象
		print(10);
		System.out.println("继续执行sayOK");
	}
	
	public void m1(){
		B b = new B();
		b.hi();
	}
}

class B{
	public void hi(){
		System.out.println("B类中的hi()被执行");
	}
}