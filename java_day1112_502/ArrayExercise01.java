public class ArrayExercise01{
	public static void main(String[] args){
		//  ����һ��char���͵�26��Ԫ�ص����飬�ֱ����'A'-Z����
		//  ʹ��forѭ����������Ԫ�ز���ӡ������
		//  ��ʾ:char������������'A��+1 ->��B'
		char a[] = new char[26];
		char c = 'A';
		for(int i = 0;i<a.length;i++){
			a[i] = c;   // (int)'A' + i
			c++;
			System.out.println("��" + (i+1) + "��Ԫ����" + a[i]);
		}			
	}
}