// ���1-100֮��Ĳ��ܱ�5����������ÿ5��һ��
// ��ο���5������һ��



public class Homework06{
	public static void main(String[] args){
		int count = 0;
		for(int i =1;i<=100;i++){
			 if(i%5 !=0){
				 System.out.print(i + "\t");   //�������ֻ��о��ǽ�println����print
				 count++;
				 if(count%5 ==0){
					System.out.println();     // ������������
				 }
			}
		}
	}
}