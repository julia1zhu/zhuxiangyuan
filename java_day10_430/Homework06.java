// 输出1-100之间的不能被5整除的数，每5个一行
// 如何控制5个输入一行



public class Homework06{
	public static void main(String[] args){
		int count = 0;
		for(int i =1;i<=100;i++){
			 if(i%5 !=0){
				 System.out.print(i + "\t");   //不让数字换行就是将println换成print
				 count++;
				 if(count%5 ==0){
					System.out.println();     // 这个是输出换行
				 }
			}
		}
	}
}