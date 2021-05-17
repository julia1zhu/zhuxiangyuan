// 循环输入5个成绩，保存到double数组，并输出

import java.util.Scanner;
public class Array02{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double scores[] = new double[5]; 
		
		for(int i = 0; i < scores.length;i++){
			System.out.println("请输入成绩");
			scores[i] = scanner.nextDouble();
		}
		for(int j = 0;j < scores.length;j++){
			System.out.println(scores[j]);
		}
	}
}