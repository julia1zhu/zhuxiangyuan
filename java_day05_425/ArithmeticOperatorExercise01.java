// 算术运算符的面试题

public class ArithmeticOperatorExercise01{
	public static void main(String[] args){
		
		// 面试题1
		int i = 1;
		i = i++;
		System.out.println(i);   
		//自己的理解：2 因为虽然是先将后者的值赋给等式前面，为1.但是这是同一个变量
		//1 正确思路：使用临时变量：1）temp=l; 2)i=i+1; 3)i=temp;
	
		int a = 1;
		a = ++a;
		System.out.println(a); // 2
		//1）i=i+1; 2);temp=i 3)i=temp;
	
	
		// 面试题2
		int i1 = 10;
		int i2 = 20;
		int i3 = i1++;   // i3 = 10 ; i1 =11;
		System.out.print("i3=" + i3); //10
		System.out.println("i2=" + i2); //20
		
		i3 = --i2; // i2 = 19 ,i3 =19
		System.out.print("i3=" + i3); // 19
		System.out.println("i2=" + i2); //19

	
	
	}
}