// �����������������

public class ArithmeticOperatorExercise01{
	public static void main(String[] args){
		
		// ������1
		int i = 1;
		i = i++;
		System.out.println(i);   
		//�Լ�����⣺2 ��Ϊ��Ȼ���Ƚ����ߵ�ֵ������ʽǰ�棬Ϊ1.��������ͬһ������
		//1 ��ȷ˼·��ʹ����ʱ������1��temp=l; 2)i=i+1; 3)i=temp;
	
		int a = 1;
		a = ++a;
		System.out.println(a); // 2
		//1��i=i+1; 2);temp=i 3)i=temp;
	
	
		// ������2
		int i1 = 10;
		int i2 = 20;
		int i3 = i1++;   // i3 = 10 ; i1 =11;
		System.out.print("i3=" + i3); //10
		System.out.println("i2=" + i2); //20
		
		i3 = --i2; // i2 = 19 ,i3 =19
		System.out.print("i3=" + i3); // 19
		System.out.println("i2=" + i2); //19

	
	
	}
}