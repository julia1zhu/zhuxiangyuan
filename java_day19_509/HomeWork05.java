// 5.定义一个圆类Circle,定义属性:半径，提供显示圆周长功能的方法，提供显示圆面积的方法

 public class HomeWork05{
	  public static void main(String[] args){
		  Circle c1 = new Circle(3.4);
		  c1.showArea();
		  c1.showPerimeter();
	  }
}

class Circle {
	double radius;
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	public void showPerimeter(){
		System.out.println("圆的周长为" + Math.PI * 2 * radius);
	}
	public void showArea(){
		System.out.println("圆的面积为" + Math.PI * radius * radius);
	
	}
}