public class VarScope{
	public static void main(String[] args){
		
	}
}

class Cat {
	// ȫ�ֱ�����Ҳ���������ԣ�������Ϊ����Cat�ࣺ cry��eat�ȷ���ʹ������
	// �����ڶ���ʱ������ֱ�Ӹ�ֵ
	int age = 10;
	
	//ȫ�ֱ���(����)���Բ���ֵ��ֱ��ʹ�ã���Ϊ��Ĭ��ֵ,
	//�ֲ��������븳ֵ�󣬲���ʹ�ã���Ϊû��Ĭ��ֵ

	
	double weight; 
	public void cry(){
		// �ֲ�����һ����ָ�ڳ�Ա�����ж���ı���
		// �����name ��n���Ǿֲ�����
		// ������ֻ��cry��
		String name = "julia";
		int n = 10;
		System.out.println("��cry������ʹ������" + age);
	}
	
	public void eat(){
		System.out.println("��eat������ʹ������" + age);
	}
}