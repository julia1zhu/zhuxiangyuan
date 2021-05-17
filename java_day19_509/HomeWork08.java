


public class HomeWork08 {  // 10,9,10
	
	int count = 9;
	
	public void count1(){
		count = 10;
		System.out.println("count1=" + count);
	}
	
	public void count2(){
		System.out.println("count1=" + count++);
	}
	
	// 这是main方法，任何一个类都可以有主方法
	public static void main(String[] args){
		
		// 1. new HomeWork08()是匿名对象，特点：只能用一次，使用后就不能再使用
		new HomeWork08().count1();
		HomeWork08 t1 = new HomeWork08();
		t1.count2();
		t1.count2();
	}
}