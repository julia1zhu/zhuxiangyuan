//2)ʵ�ֵ�¼��֤����3�λ��ᣬ����û���Ϊ"���桱,����"666"��ʾ��¼�ɹ�,
//  ������ʾ���м��λ��ᣬ��ʹ��for+ break���
import java.util.Scanner;
public class BreakExercise02{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		for(int i = 1;i <= 3;i++){
			System.out.println("�������û���");
			String user = scanner.next();
			
			System.out.println("����������");
			String password = scanner.next();
			
			//  if(user == "����" && password == "666"){
			//  �ַ��������ݱȽϵķ��� 
			
			if(user.equals("����")&&"666".equals(password)){//�Ƽ��ڶ���д�������Ա����ָ������
				System.out.println("��¼�ɹ�");
				break;
			}
			System.out.println("��¼ʧ�ܣ�����" + (3 - i) + "�λ���");
		}
	}
}