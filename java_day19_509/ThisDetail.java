public class ThisDetail{
	public static void main(String[] args){
		
		T t1 = new T();
		t1.f2();
		T t2 = new T();
		t2.f3();

	}
}

class T {
	
	String name = "julia";
	int age = 22;
	
	public void f3(){
		String name = "Smith";
		// ���ݾͽ�ԭ������ֲ�����������age��name��ֵ����ô�Ͳ�����������е�ֵ��
		System.out.println("name = " + name + " age = " + age);
		
		// һ������������е����ֺ�����
		System.out.println("name = " + this.name + " age = " + this.age);
		
	}

	
	// ϸ�ڣ� ���ʹ������﷨:this(�����б�)   
	// ע��ֻ���ڹ������з�������һ��������
	
	// ע�⣺���ʹ������﷨��this�������б���������ڵ�һ�����
	public T(){
		this("julia",22);
		System.out.println("T()������");
	}
	
	public T(String name,int age){
		System.out.println("T(String name,int age)������");
		
	}
	
	
	//ϸ�ڣ� ���ʳ�Ա�������﷨:this.������(�����б�);
	public void f1(){
		System.out.println("f1()����");
	}
	
	public void f2(){
		System.out.println("f2()����");
		// ���ñ����f1
		f1();         // ��һ�ַ�ʽ
		this.f1();    // �ڶ��ַ�ʽ
	
		
	}
	
	
	
	
	
	
	
	
}