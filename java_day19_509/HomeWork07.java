 // 7.���һ��Dog�࣬�����֡���ɫ���������ԣ������������show()��ʾ����Ϣ��
 // ���������󣬽��в��ԡ�����ʾthis.���ԡ�HomeworkO7.java

 
 public class HomeWork07{
	  public static void main(String[] args){
		  Dog dog1 = new Dog("С��","��ɫ",3);
		  dog1.show();
		  Dog dog2 = new Dog("С��","��ɫ",2);
		  dog2.show();
	  }
}

class Dog {
	String name;
	String color;
	int age;
	
	public Dog(String name,String color,int age){
		this.name = name;
		this.color = color;
		this.age = age;
	}
	
	public void show(){
		System.out.println("�ù�������Ϣ�ǣ� ������" + name + ",��ɫ��" + color + ",������" + age);
	}
	
	
}
 