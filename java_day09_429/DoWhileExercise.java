//  1)��ӡ1��100[ѧ����]
//  2)����1��100�ĺ�[ѧ����]
//  3)ͳ��1������200֮���ܱ�5���������ܱ�3�����ĸ���
//  4)�����������Ǯ�����Ϻ���һֱʹ�������ޣ�ֱ������˵��ǮΪֹ[System.out.println(���Ϻ���:��Ǯ��?y/n")]


public class DoWhileExercise{
	
	public static void main(String[] args){
		int i = 1;
		int sum = 0;
		do{
			System.out.println(i);
			sum += i;
			i++;
		}while(i<=100);
		System.out.println(sum);
	}
}