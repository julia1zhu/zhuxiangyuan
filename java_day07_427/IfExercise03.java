// 4. �ж�һ������Ƿ������꣬����������Ƿ����������֮һ:
// (1)����ܱ�4�����������ܱ�100����;(2)�ܱ�400����

import java.util.Scanner;
// ����֧��˫��֧��ϰ
public class IfExercise03{
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���������");
		int year = scan.nextInt();
		
		if((year%4 == 0 && year%100 != 0) || year % 400 == 0){
			System.out.println("������������");
		}else{
			System.out.println("�����ݲ�������");
		}
	}
}