public class PropertiesDetail{
	public static void main(String[] args){
		// p1 �Ƕ��������������ã�
		// new Person���������Ķ���ռ䣨���ݣ����������Ķ���
		Person p1 = new Person();
		
		// ���������Ĭ��ֵ�������������
		System.out.println("������" + p1.age);
		System.out.println("������" + p1.name);
		System.out.println("нˮ��" + p1.sal);
		System.out.println(p1.isPass);
		
	}
}

// 3)�����������ֵ,��Ĭ��ֵ,���������һ�¡�
//����˵: int 0��short O,byte 0, long 0, float 0.0,double 0.0, 
// char (uo000�� boolean false,String null

class Person{
	int age;
	String name;
	double sal;
	boolean isPass;
	
}
