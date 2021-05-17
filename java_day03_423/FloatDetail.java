public class FloatDetail{
	
	public static void main(String[] args){
		
		//Java的浮点型常量默认为double型，声明float型常量，须后加f或‘F'
		float n1 = 1.1F; //对
		// float n2 = 1.1; 错
		double n3 = 1.1F; //对
	
	     //	十进制数形式:如:    5.12   512.0f    .512(必须有小数点)
		 // 科学计数法形式如:   5.12e2[5.12*10的2次方] 5.12E-2（5.12/10的二次方）
		double n4 = .512;  // 等价0.512
		double n5 = 512.0f; // 512.0
		System.out.println(n4);
		System.out.println(n5);
		System.out.println(5.12e2); // 512.0
		System.out.println(5.12E-2);
	
		//通常情况下，应该使用double型，因为它比float型更精确:
		double n9 = 2.1234567851;
		float n10 = 2.1234567851F;
		System.out.println(n9);
		System.out.println(n10);
		
		double num1 = 2.7;
		double num2 =8.1/3;
		System.out.println(num1);  //2.7
		System.out.println(num2);  //接近2.7的一个小数

	// 得到一个重要的使用点:当我们对运算结果是小数的进行相等判断是，要小心
	// 应该是以两个数的差值的绝对值,在某个精度范围类判断
	// 如果是直接赋值的小数进行比较，则是相等的
		if(num1 == num2){
			System.out.println("相等");
			}
		if(Math.abs(num1 - num2)<0.00001){
			System.out.println(Math.abs(num1 - num2));
		}	

	}
}