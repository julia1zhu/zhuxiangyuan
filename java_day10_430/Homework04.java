// �ж�һ�������Ƿ�Ϊˮ�ɻ���
// ˮ�ɻ�����ָһ��3λ���������λ�������������͵����䱾��
// 153 = 1*1*1 + 5*5*5 + 3*3*3��

import java.util.Scanner;
public class Homework04{
	public static void main(String[] args){
		System.out.println("������һ��3λ����������");
		Scanner scanner = new Scanner(System.in);
		int lilynum = scanner.nextInt();
		int c1 = lilynum/100;
		int c2 = (lilynum%100)/10;
		int c3 = ((lilynum%100)%10)/1;  //n%10
		if(c1*c1*c1 + c2*c2*c2 + c3*c3*c3 == lilynum){
			System.out.println("�������һ��ˮ�ɻ���");
		}else{
			System.out.println("���������һ��ˮ�ɻ���");
		}
	}
}