/* 1.��д������Methods�ж����������ط��������á�������Ϊm��
���������ֱ����һ��int������ ����int������һ���ַ���������
�ֱ�ִ��ƽ�����㲢����������˲�������������ַ�����Ϣ��
�������main (�����зֱ��ò��������������������


2.��Methods�࣬ �����������ط���max()
	��һ����������������intֵ�е����ֵ
	�ڶ�����������������doubleֵ�е����ֵ
	��������������������doubleֵ�е����ֵ
	���ֱ��������������

*/


public class OverLoadExercise{
	public static void main(String[] args){
		Methods method = new Methods();
		method.m(3);
		method.m(5,8);
		method.m("��������");
		
		System.out.println("����ֵ�нϴ��Ϊ" + method.max(3,5));
		System.out.println("����ֵ�нϴ��Ϊ" + method.max(3.8,5.7));
		System.out.println("����ֵ�нϴ��Ϊ" + method.max(3.8,5.7,1.2));
	}
}

class Methods{
	public void m(int m){
		System.out.println(m + "��ƽ����Ϊ" + m*m);
	}
	public void m(int m,int n){
		System.out.println("�������ĳ˻�Ϊ" + m*n);
	}
	public void m(String m){
		System.out.println("�ַ�����ϢΪ" + m);
	}
	
	public int max(int m,int n){
		return m>n?m:n;
	}
	public double max(double m,double n){
		return m>n?m:n;
	}
	public double max(double m,double n,double z){
		return (m>n?m:n)>z?(m>n?m:n):z;
	}
	
	
	
}