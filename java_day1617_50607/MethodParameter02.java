public class MethodParameter02{
	public static void main(String[] args){	
//B���б�дһ������test100�����Խ���һ�����飬�ڷ������޸ĸ����飬����ԭ���������Ƿ�仯?
//B���б�дһ������test200�����Խ���һ��Person(age,sal)�����ڷ������޸ĸö������ԣ�����ԭ���Ķ����Ƿ�仯?
		int[] arr = {1,2,3,4,5};
		
		B obj = new B();
		obj.test100(arr);
		System.out.println("main�����е�����");
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		arr[3] = 520;
		
		Person p = new Person();
		p.name = "julia";
		p.age = 10;
		
		obj.test200(p);
		// �����⣬���test200ִ�е��� p = null������Ľ����10
		// �����⣬���test200ִ�е��� p = new Person(),����Ľ����10
		System.out.println("main������p.age" + p.age);
	
	}
}


class Person{
	
	String name;
	int age;
}

class B {
	public void test100(int[] arr){
		System.out.println("�޸�ǰ������\n" );
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		arr[3] = 520;
		
		System.out.println("�޸ĺ������\n" );
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public void test200(Person p){
		// 1.  p = null;
		
		
		// 2. p = new Person();
		//    p.name = "tom"
		//    p.age = "20"
		p.age = 10000;
	}
	
	
	
	
	
}