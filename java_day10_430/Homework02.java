//  2.实现判断一个整数，属于哪个范围:大于0;小于0;等于0


import java.util.Scanner;
public class Homework02{
	public static void main(String[] args){
		System.out.println("请输入一个整数！");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		if(num > 0){
			System.out.println("该整数大于0！");
		}else if(num == 0){
			System.out.println("该整数等于0！");
		}else{
			System.out.println("该整数小于0！");
		}
	
	}
}
	