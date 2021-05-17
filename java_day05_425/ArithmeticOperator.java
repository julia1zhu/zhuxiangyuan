// 演示算术运算符的使用

public class ArithmeticOperator{
	public static void main(String[] args){
		
		//  / 的使用
		System.out.println(10 / 4);  // 从数学来看是2.5，java中是2，因为两者都为int类型
		System.out.println(10.0 / 4); //2.5，计算过程中提升为内存较大的double型
		double d = 10 / 4;  //2.0
		System.out.println(d);
		
		
		// % 取模，取余的使用
		// 在java中 %的本质，看一个公式 a % b = a - a / b * b; 
		System.out.println(10 % 3);   //1
		
		System.out.println(-10 % 3);   //-1
		System.out.println(10 % -3);   //1
		System.out.println(-10 % -3);   //-1
		
		
		// 自增、自减运算符的使用
		int i = 10;
		i++;//自增等价于i = i + 1; => i= 11
		++i;//自增等价于i = i + 1; => i =12
		System.out.println("i=" + i);//12
		
		//作为表达式使用
		//前++∶++i先自增后赋值
		//后++∶i++先赋值后自增
		
		int j = 8;
		//int k = ++j;//等价j=j+1;k=j;
		int k = j++;//等价k =j; j = j + 1;
		System.out.println("k=" + k + "," + "j=" + j);//8 9

	}
}