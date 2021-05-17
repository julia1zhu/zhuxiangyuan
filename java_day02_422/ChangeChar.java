//演示转义字符的使用
public class ChangeChar{
	public static void main(String[] args){
	
		//\t 对齐功能
		System.out.println("长沙\t武汉\t重庆");
		//\n 换行
		System.out.println("长沙\n武汉\n重庆");
		// \\  一个\
		
		System.out.println("C:\\Windows\\System32\\cmd.exe");
		// \" 
		System.out.println("奶奶说：\"我今天很想你\"");
		// \r
		System.out.println("我爱北京天安门\r南京");
		
		
		//课堂练习
		//要求使用一个输出语句，达到如下效果
		// 书名  作者   价格   销量
		// 三国  罗贯中 120    1000
		
		System.out.println("书名\t作者\t价格\t销量\n三国\t罗贯中\t120\t1000");
		
		
	}
}