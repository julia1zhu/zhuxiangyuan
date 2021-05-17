// 位运算符
public class BitOperator02{
	
	public static void main(String[] args){
		int a=1>>2;  //向右位移2位  0
		int b=-1>>2; // 算术右移    -1
		int c=1<<2;  // 算术左移    4
		int d=-1<<2; // 算术右移  -4
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
		System.out.println("d=" + d);

	}
}