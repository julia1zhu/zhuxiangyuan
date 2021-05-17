 import java.util.Scanner;
 //  如果李三不还钱，则老韩将一直使出五连鞭
 //  直到李三说还钱为止[System.out.println(“老韩问:还钱吗? y/n")]

public class DoWhileExercise02{
	
	public static void main(String[] args){
		
		char answer = ' ';
	// 化繁为简
	// （1） 不停的问还钱吗？
	// （2）接收回答 answer	
	//  (3) 如果回答不是y，就结束循环
	do{
			System.out.println("老韩使出五连鞭");
			System.out.println("小朱问：还钱吗？  y/n");
			Scanner scanner = new Scanner(System.in);
			answer = scanner.next().charAt(0);
			System.out.println("他的回答是" + answer);
		
		}while(answer != 'y');
		
	
		
	}
}


