public class PropertiesDetail{
	public static void main(String[] args){
		// p1 是对象名（对象引用）
		// new Person（）创建的对象空间（数据）才是真正的对象
		Person p1 = new Person();
		
		// 对象的属性默认值，遵守数组规则
		System.out.println("年龄是" + p1.age);
		System.out.println("名字是" + p1.name);
		System.out.println("薪水是" + p1.sal);
		System.out.println(p1.isPass);
		
	}
}

// 3)属性如果不赋值,有默认值,规则和数组一致。
//具体说: int 0，short O,byte 0, long 0, float 0.0,double 0.0, 
// char (uo000， boolean false,String null

class Person{
	int age;
	String name;
	double sal;
	boolean isPass;
	
}

