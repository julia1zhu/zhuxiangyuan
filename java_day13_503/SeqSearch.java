import java.util.Scanner;
public class SeqSearch{
	public static void main(String[] args){
	// 1. ��һ������:��üӥ������ëʨ����������������������������Ϸ:
	// �Ӽ�������������һ�����ƣ��ж��������Ƿ���������ơ�˳����ҡ�
    // Ҫ��:����ҵ��ˣ�����ʾ�ҵ����������±�ֵ��
	
	
	// ĳ�����˼��
		int index = -1;
	    String[] names ={"��üӥ��","��ëʨ��","��������","��������"};
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������");
		String name = scanner.next();
		
		for(int i = 0;i < names.length;i++){
			if(name.equals(names[i])){
				System.out.println("�ҵ���" + name);
				System.out.println("�±�Ϊ" + i);
				index = i;
				break;
			}
		}
		
		if(index == -1){
			System.out.println("�������в�����������");
		}
	
	}

}