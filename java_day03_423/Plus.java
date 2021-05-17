public class Plus{
	public static void main(String[] args){
			System.out.println(100 + 98); // 198
			System.out.println("100" + 98);  // 一边是字符串，所以是拼接  10098
			System.out.println(100 + 3 + "hello"); // 按照顺序看+号   103hello
			System.out.println("hello" + 100 + 98); //hello10098
	}
}