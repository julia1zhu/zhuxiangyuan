/*һ������:ǰ�������ڴ�������Ķ���ʱ�����Ȱ�һ�����󴴽��ú�
	�ٸ�����������������Ը�ֵ��
	���������Ҫ���ڴ�������Ķ���ʱ����ֱ��ָ�������������������,����ô��?
	��ʱ�Ϳ���ʹ�ù�������
*/

public class Constructor01{
	public static void main(String[] args){
		// ������newһ������ʱ��ֱ��ͨ���������ƶ����ֺ�����
		Person p1 = new Person("smith",80);
		System.out.println("p1�������Ϣ����");
		System.out.println("p1���������" + p1.name);
		System.out.println("p1���������" + p1.age);
	}
}

class Person {
	String name;
	int age;
	
	// ������
	/* 1.������û�з���ֵ��Ҳ����дvoid
	   2.������������Person��������һ��
	   3.���������β��б����ͳ�Ա����һ��
	 */
	 
	public Person(String pName,int pAge){
		name = pName;
		age = pAge;
		System.out.println("�����������ã���ɶ������Եĳ�ʼ��");
	}
	
}