public class CharDetail{
	
	public static void main(String[] args){
		char c2 = 'a';//输出'a’
		System.out.println(c2);
		
		char c3 = '韩';
		System.out.println((int)c3);//38839
		
		char c4 = 38889;
		System.out.println(c4); //韩
		
		//char类型是可以进行运算的，相当于一个整数，因为它都对应有Unicode码.
		System.out.println('a' + 10);
		
		//课堂小测试
		char c5 = 'b' + 1; // 98+1==>99
		System.out.println((int)c5);//99
		System.out.println(c5);  

	}
}