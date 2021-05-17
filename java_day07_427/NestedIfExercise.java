/*	出票系统:根据淡旺季的月份和年龄,打印票价
4-10旺季:
	成人(18-60):60
	儿童(<18):半价
	老人(>60) :1/3
淡季:
	成人:40其他:20
*/

import java.util.Scanner;
public class NestedIfExercise{
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入当前月份（1-12）");
		int month = scanner.nextInt();
		
		if(month >= 1 && month <= 12){
			if(month >=4 && month <=10){
				System.out.println("请输入购票人的年龄");
				int age = scanner.nextInt();
				if(age >= 18 && age <= 60){
					System.out.println("票价为60元");
				}else if(age <18){
					System.out.println("票价为30元");
				}else{
					System.out.println("票价为20元");
				}
			
		    }else {
				System.out.println("请输入购票人的年龄");
				int age = scanner.nextInt();
				if(age >= 18 && age <= 60){
				System.out.println("票价为40元");
				}else {
				System.out.println("票价为20元");
				}
			}
		}else{
			System.out.println("请重新输入月份，在1-12内");
		}
	}	
}
