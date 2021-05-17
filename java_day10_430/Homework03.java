// 判断一个年份是否为闰年
// 能被4整除且不能被100整除的为闰年。
// 世纪年能被400整除的是闰年。

import java.util.Scanner;
public class Homework03{
	public static void main(String[] args){
		System.out.println("请输入一个年份！");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		
		if((year%4==0 && year%100 !=0) || year%400 == 0){
			System.out.println("该年是闰年");
		}else{
			System.out.println("该年不是闰年");
		}
		
    }
}