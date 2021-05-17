// 6.编程创建一个Cale计算类，在其中定义2个变量表示两个操作数
//   定义四个方法实现求和、差、乘、商(要求除数为0的话，要提示)并创建两个对象，分别测试



 public class HomeWork06{
	  public static void main(String[] args){
		  Cale c = new Cale(4.0,0.0);
		  System.out.println("两个数的和为" + c.sum());
		  System.out.println("两个数的差为" + c.minus());
		  System.out.println("两个数的乘积为" + c.mul());
		  
		  Double res = c.div();
		  if(res != null){
			System.out.println("两个数的商为" + res);
		  }
	  }
 }
 
 class Cale {
	 double a;
	 double b;
	 
	 public Cale(double a,double b){
		 this.a = a;
		 this.b = b;
	 }
	 
	 public double sum(){
		 return a + b;
	 }
	 
	 public double minus(){
		 return a - b;
	 }
	 
	 public double mul(){
		 return a * b;
	 }
	 
	 public Double div(){
		 if (b == 0){
			 System.out.println("被除数不能为0，请重新输入数字");
			 return null;
		}else{
			 return a/b;
		}
	 }
 }