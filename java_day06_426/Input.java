import java.util.Scanner;//1. ��ʾ��java.util�µ�Scanner�ർ��

public class Input{
	
	public static void main(String[] args){
		//��ʾ�����û�������
		// 2. ���� Scanner����
		
		Scanner scanner = new Scanner(System.in);
		
		// 3. �����û����룬ʹ����ط���
		System.out.println("�������������");
		String name = scanner.next(); //������ﲻ���룬����ͻ�һֱͣ��������
		
		System.out.println("�������������");
		int age = scanner.nextInt();
		
		System.out.println("���������нˮ");
		double salary = scanner.nextDouble();
		
	}
}