//ͳ��3����ɼ����,ÿ������5��ͬѧ������������ƽ���ֺ����а༶��ƽ����[ѧ���ĳɼ��Ӽ�������].
//ͳ�������༰������,ÿ������5��ͬѧ��

// ��Ļ����˵����༶������ͬ��ô�죿  ����������ü�������   
// ˼·�������࣬5��ͬѧ������������������,����Ӧ��������ѭ��
// ����������ƽ������Ϊ������֪��������Ӧ������ܷ�

//����Ϊ���ȼ���һ�������ѧ���ĳɼ�
import java.util.Scanner;
public class MultiForExercise01{
	
	public static void main(String[] args){
		int sumAll = 0;
		for(int stuClass = 1,sumClass = 0,count = 0;stuClass <= 3;stuClass++){
			System.out.println("�������" + stuClass + "���༶�ĳɼ���");
			for(int stu = 1; stu <= 5;stu++){
				Scanner scanner = new Scanner(System.in);
				System.out.println("�������" + stu + "��ѧ���ĳɼ���");
				double score = scanner.nextDouble();
				if(score >= 60){
					count++;
				}
				sumClass += score;
				sumAll += sumClass;
			}
			System.out.println("��" + stuClass + "�����ƽ����Ϊ" + sumClass/5);
			System.out.println("��" + stuClass + "����Ĳ���������Ϊ" + count);
		}
		System.out.println("���а༶��ƽ����Ϊ" + sumAll/15);
		
	}
}
