public class VarScope{
	public static void main(String[] args){
		
	}
}

class Cat {
	// 全局变量：也就是是属性，作用域为整个Cat类： cry、eat等方法使用属性
	// 属性在定义时，可以直接赋值
	int age = 10;
	
	//全局变量(属性)可以不赋值，直接使用，因为有默认值,
	//局部变量必须赋值后，才能使用，因为没有默认值

	
	double weight; 
	public void cry(){
		// 局部变量一般是指在成员方法中定义的变量
		// 这里的name 和n都是局部变量
		// 作用域只在cry中
		String name = "julia";
		int n = 10;
		System.out.println("在cry方法中使用属性" + age);
	}
	
	public void eat(){
		System.out.println("在eat方法中使用属性" + age);
	}
}