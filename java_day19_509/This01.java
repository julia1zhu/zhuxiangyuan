public class This01{
	public static void main(String[] args){
		Dog dog1 = new Dog("С��",3);
		System.out.println("dog1��hashcode = " + dog1.hashCode());
		dog1.infoo();
	    Dog dog2 = new Dog("���",5);
		System.out.println("dog2��hashcode = " + dog2.hashCode());
		// dog2.infoo();
	}
}
class Dog{
	// ��Ա����
	public String name;
	public int age;
	
	// ������
	/* public Dog(String dName, int dAge){
		name = dName;
		age = dAge;
	}
	
		������ǹ��������βΣ��ܹ�ֻдд���������������
		����������������ݱ�����������ԭ��
		��������name���Ǿֲ�����������������
		��������age�Ǿֲ�����������������
		
		������this�ؼ��������
	*
		public Dog(String name, int age){
			name = name;
			age = age;
		}
		
	*/
	public Dog(String name, int age){
		this.name = name;   //�ĸ����������������������thisָ�ľ����ĸ�����
		this.age = age;
		System.out.println("this.hashCode = " + this.hashCode());
	}
	
	
	// ��Ա��������������������Ϣ
	public void infoo(){
		System.out.println("this.hashCode = " + this.hashCode());
		System.out.println(name + "\t" + age + "\t");
	}
}