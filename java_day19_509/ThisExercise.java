// ����Person�࣬������name��age���ԣ����ṩcompareTo�ȽϷ���,�����ж��Ƿ����һ�������
//�ṩ������TestExercies���ڲ������ֺ�������ȫһ��,�ͷ���true,���򷵻�false


public class ThisExercise{
	public static void main(String[] args){
		Person p1 = new Person("julia",22);
		if(p1.compareTo("lily",22)){
			System.out.println("����������ȫ���");
		}else{
			System.out.println("�������˲����");
		}
		
	}
}
	
class Person {
	String name;
	int age;
	
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public boolean compareTo(String name,int age){
		if (this.name.equals(name)&& this.age == age){
			return true;
		}else{
			return false;
		}
		
	}
}