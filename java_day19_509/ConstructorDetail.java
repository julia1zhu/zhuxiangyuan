public class ConstructorDetail{
	public static void main(String[] args){
		Person p1 = new Person("king",40);
		Dog d1 = new Dog("С��",3);
		//   Dog d1 = new Dog();  ��Ĭ���޲ι����������Ǻ󣬾Ͳ��������ַ�ʽ����������
		//   ����������ʹ�ã�������ʾ�Ķ���һ��
		
		// ���췽��һ�㲻ʹ�ó�Ա�����������ַ���  ����d1.Person������  ����ô��
	}
}

class Person {
	String name;
	int age;
	
	// 1. һ������Զ�������ͬ�Ĺ�������������������
	
	// ��һ��������  ָ�����ֺ�����
	public Person (String pName,int pAge){
		name = pName;
		age = pAge;
	}
	// �ڶ���������   ָ������
	public Person(String pName){
		name = pName;
		
	}
	// ������������  ָ������
	public Person (int pAge){
		age = pAge;
	}
}

class Dog {
	String name;
	int age;
	/*  �������Աû�ж��幹������ϵͳ���Զ���������һ��Ĭ���޲ι�����(Ҳ��Ĭ�Ϲ�����)/*
		
		Ĭ�Ϲ�����Dog() {
				}
				
	*/
	
	//һ���������Լ��Ĺ�����,Ĭ�ϵĹ������͸����ˣ��Ͳ�����ʹ��Ĭ�ϵ��޲ι�����,
	//������ʽ�Ķ���һ��,��: DogO)0д(������Ҫ)1

	
	public Dog(String pName,int pAge){
		name = pName;
		age = pAge;
	}
	
	
}