// ��ѧ���ɼ�����60�ֵģ����"�ϸ�"������60�ֵģ����"���ϸ�"��(ע:����ĳɼ����ܴ���100),��ʾ�ɼ�/60

import java.util.Scanner;
public class SwitchExercise02{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������");
		
		// ����60.�Ǹ���Χ������ֱ��ʹ�ã���Ҫת��
		// ����ɼ��ڡ�60-100������int�����ɼ�/60��=1
		// ����ɼ��ڡ�0-60������int�����ɼ�/60��=0
		
		double score = scanner.nextDouble();
		
		//  ʹ��if-else��֤����ĳɼ�����Ч�� 0-100
		if(score >=0 && score <= 100){
			switch((int)score/60){
				case 0:
					System.out.println("���ϸ�");
					break;
				case 1:
					System.out.println("�ϸ�");
					break;
			}
		}else{
			System.out.println("����ĳɼ�����");
		}
	}
}