// 11.在测试方法中，调用method方法，代码如下，编译正确，试写出method方法的
//    定义形式,调用语为: System.out.println(method(method(10.0,20.0), 100));



public class HomeWork11{
	
	double m1;
	double m2;
	public HomeWork11(double m1,double m2){
		this.m1 = m1;
		this.m2 = m2;
	}
	public double method(double m1,double m2){
		return m1 + m2;
	}
	  
	
	public static void main(String[] args){
		HomeWork11 test = new HomeWork11();
		System.out.println(method(method(10.0,20.0), 100));
	 
	} 
} 
	  
	

