public class VarScopeDetail{
	public static void main(String[] args){
		Person p1 = new Person();
		p1.say();
		T t1 = new T();
		t1.test(); // ��һ�ֿ�����ʶ������Եķ�ʽ
		t1.test2(p1); // �ڶ��ֿ�����ʶ������Եķ�ʽ
	}
}


class T {
	//	ȫ�ֱ���/����:���Ա�����ʹ�ã���������ʹ��(ͨ���������)
	public void test(){
		Person p2 = new Person();
		System.out.println(p2.name);
	}
	
	public void test2(Person p){
		System.out.println(p.name);
	}
}


class Person {
	
	private int age = 20; // ���Կ��Լ����η� public protected private...
	
	String name = "Tom";
	public void say(){
		String name = "Jerry";
		System.out.println("name=" + name);
	}
	
	
	public void hi(){
		String address = "����";
		// String address = "�Ϻ�";  �����ظ�����
		String name = "julia";
	}
}