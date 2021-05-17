public class This01{
	public static void main(String[] args){
		Dog dog1 = new Dog("小白",3);
		System.out.println("dog1的hashcode = " + dog1.hashCode());
		dog1.infoo();
	    Dog dog2 = new Dog("大黄",5);
		System.out.println("dog2的hashcode = " + dog2.hashCode());
		// dog2.infoo();
	}
}
class Dog{
	// 成员变量
	public String name;
	public int age;
	
	// 构造器
	/* public Dog(String dName, int dAge){
		name = dName;
		age = dAge;
	}
	
		如果我们构造器的形参，能够只写写成属性名，会更好
		但是如果这样，根据变量的作用域原则
		构造器的name就是局部变量，而不是属性
		构造器的age是局部变量，而不是属性
		
		——》this关键字来解决
	*
		public Dog(String name, int age){
			name = name;
			age = age;
		}
		
	*/
	public Dog(String name, int age){
		this.name = name;   //哪个对象调用这个构造器，这个this指的就是哪个对象
		this.age = age;
		System.out.println("this.hashCode = " + this.hashCode());
	}
	
	
	// 成员方法，输出对象的属性信息
	public void infoo(){
		System.out.println("this.hashCode = " + this.hashCode());
		System.out.println(name + "\t" + age + "\t");
	}
}