// 判断一个整数是否为水仙花数
// 水仙花数是指一个3位数，其各个位数上数字立方和等于其本身
// 153 = 1*1*1 + 5*5*5 + 3*3*3；

import java.util.Scanner;
public class Homework04{
	public static void main(String[] args){
		System.out.println("请输入一个3位数的整数！");
		Scanner scanner = new Scanner(System.in);
		int lilynum = scanner.nextInt();
		int c1 = lilynum/100;
		int c2 = (lilynum%100)/10;
		int c3 = ((lilynum%100)%10)/1;  //n%10
		if(c1*c1*c1 + c2*c2*c2 + c3*c3*c3 == lilynum){
			System.out.println("这个数是一个水仙花数");
		}else{
			System.out.println("这个数不是一个水仙花数");
		}
	}
}