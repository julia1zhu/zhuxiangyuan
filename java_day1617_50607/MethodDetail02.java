public class MethodDetail02{
	public static void main(String[] args){
		// 1.ͬһ�����еķ�������:ֱ�ӵ��ü��ɡ�����print(����);
		// 2.�����еķ���A�����B�෽��:��Ҫͨ�����������á�
		// ���������.������(����);������ʾ: B��sayHello����print()
		A a = new A();
		a.sayOK();
		a.m1();
		
		
		
	}
}
class A{
	public void print(int n){
		System.out.println("print���������� n=" + n);
	}
	
	public void sayOK(){   // sayok���ã�ֱ�ӵ��ã�����Ҫ��������
		print(10);
		System.out.println("����ִ��sayOK");
	}
	
	public void m1(){
		B b = new B();
		b.hi();
	}
}

class B{
	public void hi(){
		System.out.println("B���е�hi()��ִ��");
	}
}