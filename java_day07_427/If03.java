// ���뱣��ͬ־��֥�����÷�:���:
/*	1�����÷�Ϊ100��ʱ,������ü���;
	2.���÷�Ϊ(80��99]ʱ,�����������;
	3.���÷�Ϊ[60,80]ʱ,�������һ��;
	4.�������,������ò�����
	5.��Ӽ������뱣����֥�����÷�,�������ж�
*/

import java.util.Scanner;
public class If03{
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("���뱣��ͬ־��֥�����÷֣�1-100��");
		int creditGrade = scanner.nextInt();
		
		if(creditGrade >=1 && creditGrade <=100){  // �����������100.Ҳ����������ò�����,���������¸ı�
			if(creditGrade == 100){
				System.out.println("���ü���");
			}
			else if(creditGrade > 80 && creditGrade <= 99){
				System.out.println("��������");
			}
			else if(creditGrade >= 60 && creditGrade <= 80){
				System.out.println("����һ��");
			}
			else {
				System.out.println("���ò�����");
			}
		}else{
			System.out.println("���÷���Ҫ��1-100֮�ڣ�����������");
		}
	}
}

