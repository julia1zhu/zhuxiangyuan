import java.util.Scanner;
public class If01{
	// ��дһ������,���������˵�����,�����ͬ־���������18��,
	// �����"���������18,Ҫ���Լ�����Ϊ����,���������

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������");
		int age = scanner.nextInt();
		if(age > 18){
			System.out.println("���������18.Ҫ���Լ�����Ϊ����"); 
		}
		System.out.println("�������");
	}
}