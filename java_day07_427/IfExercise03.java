// 4. 判断一个年份是否是闰年，闰年的条件是符合下面二者之一:
// (1)年份能被4整除，但不能被100整除;(2)能被400整除

import java.util.Scanner;
// 单分支和双分支练习
public class IfExercise03{
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入年份");
		int year = scan.nextInt();
		
		if((year%4 == 0 && year%100 != 0) || year % 400 == 0){
			System.out.println("这个年份是闰年");
		}else{
			System.out.println("这个年份不是闰年");
		}
	}
}