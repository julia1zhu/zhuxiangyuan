// 11.�ڲ��Է����У�����method�������������£�������ȷ����д��method������
//    ������ʽ,������Ϊ: System.out.println(method(method(10.0,20.0), 100));



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
	  
	

