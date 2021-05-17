import java.util.Scanner;
public class Switch01{
	// 1.请编写一个程序，该程序可以接收一个字符，比如:a,b,c d.e,f g
	// 2.a表示星期一，b表示星期二.…
	// 3.根据用户的输入显示相应的信息.要求使用switch语句完成

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个字符a-g");
		char c = scanner.next().charAt(0);
		// 在java中，只要是有值返回，那就是一个表达式
		switch(c){
			case 'a':
				System.out.println("今天星期一，猴子穿新衣");
				break;
			case 'b':
				System.out.println("今天星期二，猴子当小二");
				break;
			case 'c':
				System.out.println("今天星期三，猴子穿新衣");
				break;
			default :
				System.out.println("输入字符不正确");
			}   
		System.out.println("退出了switch，继续执行程序");
	}
}