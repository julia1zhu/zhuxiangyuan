public class Array01{
	public static void main(String[] args){
		//1. ����һ������
		//   double[]��ʾ��double���͵�����
		double[] hens = {3,5,1,3.4,2,50};
		
		// 2. ������������ ����forѭ��
		// ���ǿ���ͨ�� hens[�±�]�����������Ԫ��
		//�±��Ǵ��տ�ʼ��ŵı����һ��Ԫ�ؾ��� hens[0],��2��Ԫ�ؾ��� hens[1] ����������
		
		double totalWeight = 0;
		for(int i = 0; i < 6;i++ ){
			totalWeight += hens[i];
			System.out.println("��" + (i+1) + "��Ԫ�ص�ֵ��" + hens[i]);
		}
		
		System.out.println("����ĳ���Ϊ" + hens.length);
	}
}