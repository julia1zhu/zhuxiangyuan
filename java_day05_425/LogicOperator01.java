//演示逻辑运算符的使用

public class LogicOperator01{
	public static void main(String[] args){
		// && he & 案例演示
		
		// 基本用法
		int age = 50;
		if(age > 20 && age < 100){
			System.out.println("ok1!");
		}
		
		if(age > 20 & age < 100){
			System.out.println("ok2!");
		}
		
		// 两者区别
		int a = 4;
		int b = 9;
		
		if(a > 5 && ++b < 3){
			System.out.println("ok3!");
		}
		// 第一个是错的，那么整个就是错的，不需要进行后面的比较了
		System.out.println("a=" + a + "\n" +"b=" + b);
		
		if(a > 5 & ++b < 3){
			System.out.println("ok3!");
		}
		// 第一个是错的，但是还要进行后面的比较
		System.out.println("a=" + a + "\n" +"b=" + b);
	}
}