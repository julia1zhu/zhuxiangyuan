// 演示for循环的使用细节

public class ForDetail{
	public static void main(String[] args){
	
	//  for(;循环判断条件;)中的初始化和变量迭代可以写到其它地方，但是两边的分号不能省略。

		int i = 1;  //循环变量初始化这个i的作用域会比较大一点，如果只在括号里，那么作用域只在for循环体内
		
		for(; i<=10 ;){
			System.out.println("哈哈哈哈哈哈" + i);
			i++;
		}		
		
		System.out.println("i=" + i);   // 这里i仍然可以使用
	}
}