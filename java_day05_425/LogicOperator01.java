//��ʾ�߼��������ʹ��

public class LogicOperator01{
	public static void main(String[] args){
		// && he & ������ʾ
		
		// �����÷�
		int age = 50;
		if(age > 20 && age < 100){
			System.out.println("ok1!");
		}
		
		if(age > 20 & age < 100){
			System.out.println("ok2!");
		}
		
		// ��������
		int a = 4;
		int b = 9;
		
		if(a > 5 && ++b < 3){
			System.out.println("ok3!");
		}
		// ��һ���Ǵ�ģ���ô�������Ǵ�ģ�����Ҫ���к���ıȽ���
		System.out.println("a=" + a + "\n" +"b=" + b);
		
		if(a > 5 & ++b < 3){
			System.out.println("ok3!");
		}
		// ��һ���Ǵ�ģ����ǻ�Ҫ���к���ıȽ�
		System.out.println("a=" + a + "\n" +"b=" + b);
	}
}