// ѭ������5���ɼ������浽double���飬�����

import java.util.Scanner;
public class Array02{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double scores[] = new double[5]; 
		
		for(int i = 0; i < scores.length;i++){
			System.out.println("������ɼ�");
			scores[i] = scanner.nextDouble();
		}
		for(int j = 0;j < scores.length;j++){
			System.out.println(scores[j]);
		}
	}
}