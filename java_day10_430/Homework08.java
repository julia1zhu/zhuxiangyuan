//  8.���1-1/2+1/3-1/4.....1/100�ĺ�

//  ����һ������������Ҫ�ѹ�ʽ����1д��1.0�����ܵõ���ȷ��ֵ
public class Homework08{
	public static void main(String[] args){
		double sum =0;
		for(int n = 1;n<=100;n++){
			if(n%2==0){
				sum -= 1.0/n;
			}else{
				sum += 1.0/n;
			}
		}
		System.out.println(sum);
	}
}