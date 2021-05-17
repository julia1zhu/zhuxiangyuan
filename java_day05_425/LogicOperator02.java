//演示逻辑运算符的使用

public class LogicOperator02{
	public static void main(String[] args){
		// || | 案例演示
		
		// 基本用法
		int age = 50;
		if(age < 20 || age < 100){
			System.out.println("ok1!");
		}
		
		if(age < 20 | age < 100){
			System.out.println("ok2!");
		}
		
		// 两者区别
		int a = 4;
		int b = 9;
		
		if(a < 5 || ++b < 3){
			System.out.println("ok3!");
		}
		// 第一个为真，那么整个结果会是真的，不会再执行后续的程序了  a=4,b=9
		System.out.println("a=" + a + "\n" +"b=" + b);
		
		if(a < 5 | ++b < 3){
			System.out.println("ok3!");
		}
		System.out.println("a=" + a + "\n" +"b=" + b);
	}
}