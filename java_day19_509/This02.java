public class This02{
	public static void main(String[] args){
		Dog dog1 = new Dog("С��",3);
		System.out.println(dog1.name + " " + dog1.age);
		
	}
}
class Dog{
	// ��Ա����
	public String name ;
	public int age = 10;
	
		public Dog(String name, int age){
			// ���ݾͽ�ԭ��ǰһ��nameӦ���Ǿֲ���������ô���ǽ���Ա������ֵ����
			// �������еľֲ�������
			// ���ݽ�����Ϊ null��10 ���Եó�
			name = name;   
			age = age;
		}
}