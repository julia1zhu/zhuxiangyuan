// 定义Person类，里面有name、age属性，并提供compareTo比较方法,用于判断是否和另一个人相等
//提供测试类TestExercies用于测试名字和年龄完全一样,就返回true,否则返回false


public class ThisExercise{
	public static void main(String[] args){
		Person p1 = new Person("julia",22);
		if(p1.compareTo("lily",22)){
			System.out.println("这两个人完全相等");
		}else{
			System.out.println("这两个人不相等");
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