// 5.����һ��Բ��Circle,��������:�뾶���ṩ��ʾԲ�ܳ����ܵķ������ṩ��ʾԲ����ķ���

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
		System.out.println("Բ���ܳ�Ϊ" + Math.PI * 2 * radius);
	}
	public void showArea(){
		System.out.println("Բ�����Ϊ" + Math.PI * radius * radius);
	
	}
}