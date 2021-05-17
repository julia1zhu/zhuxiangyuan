// 对学生成绩大于60分的，输出"合格"。低于60分的，输出"不合格"。(注:输入的成绩不能大于100),提示成绩/60

import java.util.Scanner;
public class SwitchExercise02{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入分数");
		
		// 大于60.是个范围，不能直接使用，需要转换
		// 如果成绩在【60-100】，（int）（成绩/60）=1
		// 如果成绩在【0-60），（int）（成绩/60）=0
		
		double score = scanner.nextDouble();
		
		//  使用if-else保证输入的成绩是有效的 0-100
		if(score >=0 && score <= 100){
			switch((int)score/60){
				case 0:
					System.out.println("不合格");
					break;
				case 1:
					System.out.println("合格");
					break;
			}
		}else{
			System.out.println("输入的成绩有误");
		}
	}
}