import java.util.Scanner;
public class Switch01{
	// 1.���дһ�����򣬸ó�����Խ���һ���ַ�������:a,b,c d.e,f g
	// 2.a��ʾ����һ��b��ʾ���ڶ�.��
	// 3.�����û���������ʾ��Ӧ����Ϣ.Ҫ��ʹ��switch������

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ���ַ�a-g");
		char c = scanner.next().charAt(0);
		// ��java�У�ֻҪ����ֵ���أ��Ǿ���һ�����ʽ
		switch(c){
			case 'a':
				System.out.println("��������һ�����Ӵ�����");
				break;
			case 'b':
				System.out.println("�������ڶ������ӵ�С��");
				break;
			case 'c':
				System.out.println("���������������Ӵ�����");
				break;
			default :
				System.out.println("�����ַ�����ȷ");
			}   
		System.out.println("�˳���switch������ִ�г���");
	}
}