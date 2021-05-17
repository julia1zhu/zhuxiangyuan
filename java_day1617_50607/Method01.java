public class Method01{
	public static void main(String[] args){
		/* 1)添加speak成员方法,输出我是一个好人
		   2)添加cal01成员方法,可以计算从1+..+1000的结果
           3)添加cal02成员方法,该方法可以接收一个数n，计算从1+.+n的结果
		   4)添加getSum成员方法,可以计算两个数的和
		*/
		// 方法使用
		// 1. 方法写好后，如果不去调用，就不会输出
		// 2. 先创建对象，然后调用方法即可
		Person p1 = new Person();
		p1.speak();  // 调用方法
		p1.cal01();  // 调用cal01方法
		p1.cal02(5);  // 调用cal02方法，同时给n =5
		int returnRes = p1.getSum(10,20);  
		System.out.println("getSum方法返回的值为" + returnRes);
		
	}
}

class Person{
	
		String name;
		int age;
		//  方法（成员方法）
		// 1)添加speak成员方法,输出我是一个好人
		// 1. public表示方法是公开
		// 2. void :表示方法没有返回值
		// 3. speak() : speak是方法名，()形参列表
		// 4．0方法体,可以写我们要执行的代码
		// 5. System.out.println("我是一个好人");表示我们的方法就是输出一句话
		public void speak(){
			System.out.println("我是一个好人");
		}
		
		//2)添加cal01成员方法,可以计算从1+..+1000的结果
		public void cal01(){
			int sum = 0;
			for(int i = 1;i <= 1000;i++){
				sum += i;
			}
			System.out.println("cal01计算结果=" + sum);
		}
		// 3)添加cal02成员方法,该方法可以接收一个数n，计算从1+.+n的结果
		// 1.(int n)形参列表,表示当前有一个形参n，可以接收用户输入
		public void cal02(int n){
			int sum = 0;
			for(int i = 1;i <= n;i++){
				sum += i;
			}
			System.out.println("cal02计算结果=" + sum);
		}
	
		// 4)添加getSum成员方法,可以计算两个数的和
		//1. public表示方法是公开的
		//2.int :表示方法执行后,返回一个int值
		//3. getsum方法名
		//4.(int num1, int num2）形参列表，2个形参，可以接收用户传入的两个数
		//5. return res;表示把res的值,返回

		public int getSum(int num1,int num2){
			int res = num1 + num2;
			return res;
		}
	
	
	
	
	
	
}