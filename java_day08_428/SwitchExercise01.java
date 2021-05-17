//  使用 switch 把小写类型的char型转为大写(键盘输入)。只转换a, b, c, d, e.其它的输出"other"。
import java.util.Scanner;
public class SwitchExercise01{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入小写字母");
		
		char c = scanner.next().charAt(0);
		
		switch(c){
			case 'a':
				System.out.println('A');
				break;
			case 'b':
				System.out.println('B');
				break;
			case 'c':
				System.out.println('C');
				break;
			case 'd':
				System.out.println('D');
				break;
			case 'e':
				System.out.println('E');
				break;
			default :
				System.out.println("other");
		}
	}
}