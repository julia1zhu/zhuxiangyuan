public class TernaryOperatorEx{
	
	public static void main(String[] args){
		//����:ʵ�������������ֵ
		int n1 = 553;
		int n2 = 33;
		int n3 = 123;
		//˼·
		//1���ȵõ�n1��n2�������,���浽max1
		//2��Ȼ�������max1��n3�е�����������浽max2
		
		int max1 = n1 > n2 ? n1 : n2;
		int max2 = max1 > n3 ? max1 : n3;
		System.out.println("�����=" + max2);
		
		//ʹ��һ�����ʵ��,�Ƽ�ʹ�����淽��
		int max = (n1 > n2 ? n1 : n2) > n3 ?
					(n1 > n2 ? n1 : n2) : n3;
		System.out.println("�����=" + max);

	}
}