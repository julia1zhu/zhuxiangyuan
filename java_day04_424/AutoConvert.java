public class AutoConvert{
	
	public static void main(String[] args){
		
		// 演示自动转换
		int num = 'a';
		double d1 = 80;
		System.out.println(num);
		System.out.println(d1);
		
		// 注意区别
		char c2 = 'a';//输出'a’对应的数字
		System.out.println(c2);
		System.out.println((int)c2);
	}
}