//  ʹ�� switch ��Сд���͵�char��תΪ��д(��������)��ֻת��a, b, c, d, e.���������"other"��
import java.util.Scanner;
public class SwitchExercise01{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Сд��ĸ");
		
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