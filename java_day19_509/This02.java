public class This02{
	public static void main(String[] args){
		Dog dog1 = new Dog("小白",3);
		System.out.println(dog1.name + " " + dog1.age);
		
	}
}
class Dog{
	// 成员变量
	public String name ;
	public int age = 10;
	
		public Dog(String name, int age){
			// 根据就近原则，前一个name应该是局部变量，那么就是将成员变量的值赋给
			// 构造器中的局部变量。
			// 根据结果输出为 null，10 可以得出
			name = name;   
			age = age;
		}
}