// 使用char类型，分别保存 \n \t \r \\ 1 2 3 等字符，并打印输出。
public class Homework02{
	public static void main(String[] args){
		char c1 = '\n';
		char c2 = '\t';
		char c3 = '\r';
		char c4 = '\\';
		char c5 = '1';
		char c6 = '2';
		char c7 = '3';
	
		System.out.println(c1); // 换行
		System.out.println(c2); // 制表位
		System.out.println(c3); // 回车
		System.out.println(c4); // \
		System.out.println(c5); // 1
		System.out.println(c6); // 2
		System.out.println(c7); // 3

	}
}