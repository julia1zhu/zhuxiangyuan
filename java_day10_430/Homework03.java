// �ж�һ������Ƿ�Ϊ����
// �ܱ�4�����Ҳ��ܱ�100������Ϊ���ꡣ
// �������ܱ�400�����������ꡣ

import java.util.Scanner;
public class Homework03{
	public static void main(String[] args){
		System.out.println("������һ����ݣ�");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		
		if((year%4==0 && year%100 !=0) || year%400 == 0){
			System.out.println("����������");
		}else{
			System.out.println("���겻������");
		}
		
    }
}