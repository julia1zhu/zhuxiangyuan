public class FloatDetail{
	
	public static void main(String[] args){
		
		//Java�ĸ����ͳ���Ĭ��Ϊdouble�ͣ�����float�ͳ���������f��F'
		float n1 = 1.1F; //��
		// float n2 = 1.1; ��
		double n3 = 1.1F; //��
	
	     //	ʮ��������ʽ:��:    5.12   512.0f    .512(������С����)
		 // ��ѧ��������ʽ��:   5.12e2[5.12*10��2�η�] 5.12E-2��5.12/10�Ķ��η���
		double n4 = .512;  // �ȼ�0.512
		double n5 = 512.0f; // 512.0
		System.out.println(n4);
		System.out.println(n5);
		System.out.println(5.12e2); // 512.0
		System.out.println(5.12E-2);
	
		//ͨ������£�Ӧ��ʹ��double�ͣ���Ϊ����float�͸���ȷ:
		double n9 = 2.1234567851;
		float n10 = 2.1234567851F;
		System.out.println(n9);
		System.out.println(n10);
		
		double num1 = 2.7;
		double num2 =8.1/3;
		System.out.println(num1);  //2.7
		System.out.println(num2);  //�ӽ�2.7��һ��С��

	// �õ�һ����Ҫ��ʹ�õ�:�����Ƕ���������С���Ľ�������ж��ǣ�ҪС��
	// Ӧ�������������Ĳ�ֵ�ľ���ֵ,��ĳ�����ȷ�Χ���ж�
	// �����ֱ�Ӹ�ֵ��С�����бȽϣ�������ȵ�
		if(num1 == num2){
			System.out.println("���");
			}
		if(Math.abs(num1 - num2)<0.00001){
			System.out.println(Math.abs(num1 - num2));
		}	

	}
}