import java.util.Scanner;

public class If02{
	// ��дһ������,���������˵�����,�����ͬ־���������18��,
	// �����"���������18,Ҫ���Լ�����Ϊ����,��������������������������ᴦ����

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������");
		int age = scanner.nextInt();
		
		if(age > 18){
			System.out.println("���������18.Ҫ���Լ�����Ϊ����"); 
		}
		else{
			System.out.println("������ᴦ��");
		}
		System.out.println("�������");
	}
}