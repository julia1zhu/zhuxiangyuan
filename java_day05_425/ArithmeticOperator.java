// ��ʾ�����������ʹ��

public class ArithmeticOperator{
	public static void main(String[] args){
		
		//  / ��ʹ��
		System.out.println(10 / 4);  // ����ѧ������2.5��java����2����Ϊ���߶�Ϊint����
		System.out.println(10.0 / 4); //2.5���������������Ϊ�ڴ�ϴ��double��
		double d = 10 / 4;  //2.0
		System.out.println(d);
		
		
		// % ȡģ��ȡ���ʹ��
		// ��java�� %�ı��ʣ���һ����ʽ a % b = a - a / b * b; 
		System.out.println(10 % 3);   //1
		
		System.out.println(-10 % 3);   //-1
		System.out.println(10 % -3);   //1
		System.out.println(-10 % -3);   //-1
		
		
		// �������Լ��������ʹ��
		int i = 10;
		i++;//�����ȼ���i = i + 1; => i= 11
		++i;//�����ȼ���i = i + 1; => i =12
		System.out.println("i=" + i);//12
		
		//��Ϊ���ʽʹ��
		//ǰ++��++i��������ֵ
		//��++��i++�ȸ�ֵ������
		
		int j = 8;
		//int k = ++j;//�ȼ�j=j+1;k=j;
		int k = j++;//�ȼ�k =j; j = j + 1;
		System.out.println("k=" + k + "," + "j=" + j);//8 9

	}
}