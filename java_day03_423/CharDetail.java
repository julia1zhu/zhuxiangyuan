public class CharDetail{
	
	public static void main(String[] args){
		char c2 = 'a';//���'a��
		System.out.println(c2);
		
		char c3 = '��';
		System.out.println((int)c3);//38839
		
		char c4 = 38889;
		System.out.println(c4); //��
		
		//char�����ǿ��Խ�������ģ��൱��һ����������Ϊ������Ӧ��Unicode��.
		System.out.println('a' + 10);
		
		//����С����
		char c5 = 'b' + 1; // 98+1==>99
		System.out.println((int)c5);//99
		System.out.println(c5);  

	}
}