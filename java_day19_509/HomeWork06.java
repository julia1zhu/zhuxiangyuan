// 6.��̴���һ��Cale�����࣬�����ж���2��������ʾ����������
//   �����ĸ�����ʵ����͡���ˡ���(Ҫ�����Ϊ0�Ļ���Ҫ��ʾ)�������������󣬷ֱ����



 public class HomeWork06{
	  public static void main(String[] args){
		  Cale c = new Cale(4.0,0.0);
		  System.out.println("�������ĺ�Ϊ" + c.sum());
		  System.out.println("�������Ĳ�Ϊ" + c.minus());
		  System.out.println("�������ĳ˻�Ϊ" + c.mul());
		  
		  Double res = c.div();
		  if(res != null){
			System.out.println("����������Ϊ" + res);
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
			 System.out.println("����������Ϊ0����������������");
			 return null;
		}else{
			 return a/b;
		}
	 }
 }