 import java.util.Scanner;
 //  �����������Ǯ�����Ϻ���һֱʹ��������
 //  ֱ������˵��ǮΪֹ[System.out.println(���Ϻ���:��Ǯ��? y/n")]

public class DoWhileExercise02{
	
	public static void main(String[] args){
		
		char answer = ' ';
	// ����Ϊ��
	// ��1�� ��ͣ���ʻ�Ǯ��
	// ��2�����ջش� answer	
	//  (3) ����ش���y���ͽ���ѭ��
	do{
			System.out.println("�Ϻ�ʹ��������");
			System.out.println("С���ʣ���Ǯ��  y/n");
			Scanner scanner = new Scanner(System.in);
			answer = scanner.next().charAt(0);
			System.out.println("���Ļش���" + answer);
		
		}while(answer != 'y');
		
	
		
	}
}


