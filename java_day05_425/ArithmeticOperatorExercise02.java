// �����������������

// 1. ���绹��59��ż٣���:��xx��������xx��
// 2. ����һ���������滪���¶ȣ������¶�ת�������¶ȵĹ�ʽΪ:  5/9*(�����¶�-100),
//    ����������¶ȶ�Ӧ�������¶ȡ�[234.5]

public class ArithmeticOperatorExercise02{
	public static void main(String[] args){
		
		//1. 
		int days = 59;
		int week ;
		int leftdays;
		week = days / 7;
		leftdays = days % 7;
		System.out.println("��" + week + "��������" + leftdays + "��");
		
		// 2. �����Ӽ�������0.0
		double f = 234.5;
		double c;
		c = 5 / 9 * (f - 100);
		System.out.println(c);
		
		double f1 = 234.5;
		double c1;
		// Ҫ���Ǽ������������ѧ֮��Ĺ�ϵ
		c1 = 5.0 / 9 * (f1 - 100);
		System.out.println(c1);
	}
}