/*	��Ʊϵͳ:���ݵ��������·ݺ�����,��ӡƱ��
4-10����:
	����(18-60):60
	��ͯ(<18):���
	����(>60) :1/3
����:
	����:40����:20
*/

import java.util.Scanner;
public class NestedIfExercise{
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����뵱ǰ�·ݣ�1-12��");
		int month = scanner.nextInt();
		
		if(month >= 1 && month <= 12){
			if(month >=4 && month <=10){
				System.out.println("�����빺Ʊ�˵�����");
				int age = scanner.nextInt();
				if(age >= 18 && age <= 60){
					System.out.println("Ʊ��Ϊ60Ԫ");
				}else if(age <18){
					System.out.println("Ʊ��Ϊ30Ԫ");
				}else{
					System.out.println("Ʊ��Ϊ20Ԫ");
				}
			
		    }else {
				System.out.println("�����빺Ʊ�˵�����");
				int age = scanner.nextInt();
				if(age >= 18 && age <= 60){
				System.out.println("Ʊ��Ϊ40Ԫ");
				}else {
				System.out.println("Ʊ��Ϊ20Ԫ");
				}
			}
		}else{
			System.out.println("�����������·ݣ���1-12��");
		}
	}	
}
