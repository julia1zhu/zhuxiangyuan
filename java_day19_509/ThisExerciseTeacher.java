public class ThisExerciseTeacher{
	public static void main(String[] args){
		
		Person p1 = new Person("julia",22);
		Person p2 = new Person("julia",22);
		
		System.out.println("p1和p2比较的结果为 " + p1.compareTo(p2));
	}
		
}

	
class Person {
	String name;
	int age;
	
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public boolean compareTo(Person p){
		return this.name.equals(p.name) && this.age == p.age;
		
	}
}