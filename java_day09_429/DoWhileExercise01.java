//  3)ͳ��1������200֮���ܱ�5���������ܱ�3�����ĸ���

public class DoWhileExercise01{
	
	public static void main(String[] args){
		int i =1;
		int count = 0;
		do{
			if(i%5==0 && i%3 !=0){
				System.out.println(i);
				count++;
			}
			i++;
		}while(i <= 200);
		System.out.println(count);
	}
}