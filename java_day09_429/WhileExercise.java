//  1.��ӡ1��100֮�������ܱ�3��������[ʹ��while��
//  2.��ӡ40��200֮�����е�ż��[ʹ��whileѭ����

public class WhileExercise{
	
	public static void main(String[] args){
		int i = 1;
		int a = 40;
		while(i <= 100){
			if(i%3==0){
				System.out.println(i);
			}
			
			i++;
		}
		
		while(a <= 200){
			if(a%2==0){
				System.out.println(a);
			}
			a++;
		}
		
		
	}
}
