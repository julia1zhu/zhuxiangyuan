 // 7.设计一个Dog类，有名字、颜色和年龄属性，定义输出方法show()显示其信息。
 // 并创建对象，进行测试、【提示this.属性】HomeworkO7.java

 
 public class HomeWork07{
	  public static void main(String[] args){
		  Dog dog1 = new Dog("小白","白色",3);
		  dog1.show();
		  Dog dog2 = new Dog("小花","花色",2);
		  dog2.show();
	  }
}

class Dog {
	String name;
	String color;
	int age;
	
	public Dog(String name,String color,int age){
		this.name = name;
		this.color = color;
		this.age = age;
	}
	
	public void show(){
		System.out.println("该狗狗的信息是： 名字是" + name + ",颜色是" + color + ",年龄是" + age);
	}
	
	
}
 