// 根据用于指定月份,打印该月份所属的季节。3.4,5春季6,7,8夏季9,10,11秋季12,1,2冬季[课堂练习,提示使用穿透]

import java.util.Scanner;
public class SwitchExercise03{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入月份");
		
		int month = scanner.nextInt();
		
		switch(month){
			case 3:
			case 4:
			case 5:
				System.out.println( month + "月是春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println( month + "月是夏季");
				break;
				
			case 9:
			case 10:
			case 11:
				System.out.println( month + "月是秋季");
				break;
				
			case 12:
			case 1:
			case 2:
				System.out.println( month + "月是冬季");
				break;
				
			default :
				System.out.println("输入有误");
				
		}
	}
}