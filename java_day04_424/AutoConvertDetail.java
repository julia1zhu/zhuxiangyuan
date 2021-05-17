public class AutoConvertDetail{
	
	public static void main(String[] args){
				
		//细节1：有多种类型的数据混合运算时,系统首先自动将所有数据转换成容量最大的那种数据类型，
		//然后再进行计算
		int n1 = 10; //ok
		
		//float d1 = n1 + 1.1;   错误n1 +1.1 =>结果类型是double
		double d1 = n1 + 1.1;	//对n1 + 1.1 =>结果类型是double
		float f1 = n1 + 1.1F;	//对n1 +1.1 =>结果类型是float
		
		
		//细节2：当我们把精度(容量)大的数据类型赋值给精度(容量)小的数据类型时，就会报错
		//反之就会进行自动类型转换。
		int n2 = 1.1;	//错误double -> int
		
		
		//细节3：(byte,short)和char之间不会相互自动转换
		//当把具体数赋给byte时，(1)先判断该数是否在byte范围内，如果是就可以
		byte b1 = 10;	//对, -128-127
		int n3 = 1; 	//n2是int
		byte b2 = n3;	//错误，原因:如果是变量赋值，判断类型  int类型变量存储空间是4个字节，而byte是一个字节
		char c1 = b1;	//错误，原因byte不能自动转成char

		//细节4: byte,short, char他们三者可以计算，在计算时首先转换为int类型
		byte b2 = 1;
		byte b3 = 2;
		short s1 = 1;
		
		short s2 = b2 + s1;//错,b2 + s1 =>int
		byte b4 = b2 + b3;//错误:b2 + b3 => int


		//细节5：自动提升原则:表达式结果的类型自动提升为操作数中最大的类型
		byte b4 = 1;
		short s3 = 100;
		int num200 = 1;
		float num300 = 1.1F;
		int num500 = b4 +S3 + num200 + num30O;//float -> int

	}
}