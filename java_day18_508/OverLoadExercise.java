/* 1.编写程序，类Methods中定义三个重载方法并调用。方法名为m。
三个方法分别接收一个int参数、 两个int参数、一个字符串参数。
分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
在主类的main (方法中分别用参数区别调用三个方法。


2.在Methods类， 定义三个重载方法max()
	第一个方法，返回两个int值中的最大值
	第二个方法，返回两个double值中的最大值
	第三个方法，返回三个double值中的最大值
	井分别调用三个方法。

*/


public class OverLoadExercise{
	public static void main(String[] args){
		Methods method = new Methods();
		method.m(3);
		method.m(5,8);
		method.m("哈哈哈哈");
		
		System.out.println("两个值中较大的为" + method.max(3,5));
		System.out.println("两个值中较大的为" + method.max(3.8,5.7));
		System.out.println("两个值中较大的为" + method.max(3.8,5.7,1.2));
	}
}

class Methods{
	public void m(int m){
		System.out.println(m + "的平方数为" + m*m);
	}
	public void m(int m,int n){
		System.out.println("两个数的乘积为" + m*n);
	}
	public void m(String m){
		System.out.println("字符串信息为" + m);
	}
	
	public int max(int m,int n){
		return m>n?m:n;
	}
	public double max(double m,double n){
		return m>n?m:n;
	}
	public double max(double m,double n,double z){
		return (m>n?m:n)>z?(m>n?m:n):z;
	}
	
	
	
}