public class MethodParameter02{
	public static void main(String[] args){	
//B类中编写一个方法test100，可以接收一个数组，在方法中修改该数组，看看原来的数组是否变化?
//B类中编写一个方法test200，可以接收一个Person(age,sal)对象，在方法中修改该对象属性，看看原来的对象是否变化?
		int[] arr = {1,2,3,4,5};
		
		B obj = new B();
		obj.test100(arr);
		System.out.println("main方法中的数组");
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		arr[3] = 520;
		
		Person p = new Person();
		p.name = "julia";
		p.age = 10;
		
		obj.test200(p);
		// 测试题，如果test200执行的是 p = null，下面的结果是10
		// 测试题，如果test200执行的是 p = new Person(),下面的结果是10
		System.out.println("main方法的p.age" + p.age);
	
	}
}


class Person{
	
	String name;
	int age;
}

class B {
	public void test100(int[] arr){
		System.out.println("修改前的数组\n" );
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		arr[3] = 520;
		
		System.out.println("修改后的数组\n" );
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