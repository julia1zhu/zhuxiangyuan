// �μӸ��ֱ�������������ɼ�����8.0���������������ʾ��̭��
// ���Ҹ����Ա���ʾ�����������Ů���顣
// ����ɼ����Ա𣬽����жϺ������Ϣ��


import java.util.Scanner;
public class NestedIf{
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ø��ֵĳɼ�");
		double score = scanner.nextDouble();
		
		if(score > 8.0){
			System.out.println("������ø��ֵ��Ա�");
			char gender = scanner.next().charAt(0);
			if(gender == 'Ů'){
				System.out.println("����Ů�������");
			}else if(gender == '��'){
				System.out.println("�������������");
			}
		}else{
			System.out.println("��̭");
		}
		
	}
}