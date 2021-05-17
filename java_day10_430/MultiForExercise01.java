//统计3个班成绩情况,每个班有5名同学，求出各个班的平均分和所有班级的平均分[学生的成绩从键盘输入].
//统计三个班及格人数,每个班有5名同学。

// 弹幕里面说如果班级人数不同怎么办？  解决：人数用键盘输入   
// 思路，三个班，5名同学，是有两个数字限制,所以应该是两个循环
// 求出各个班的平均分因为有人数知道。所以应该求出总分

//化繁为简：先计算一个班五个学生的成绩
import java.util.Scanner;
public class MultiForExercise01{
	
	public static void main(String[] args){
		int sumAll = 0;
		for(int stuClass = 1,sumClass = 0,count = 0;stuClass <= 3;stuClass++){
			System.out.println("请输入第" + stuClass + "个班级的成绩！");
			for(int stu = 1; stu <= 5;stu++){
				Scanner scanner = new Scanner(System.in);
				System.out.println("请输入第" + stu + "个学生的成绩！");
				double score = scanner.nextDouble();
				if(score >= 60){
					count++;
				}
				sumClass += score;
				sumAll += sumClass;
			}
			System.out.println("第" + stuClass + "个班的平均分为" + sumClass/5);
			System.out.println("第" + stuClass + "个班的不及格人数为" + count);
		}
		System.out.println("所有班级的平均分为" + sumAll/15);
		
	}
}
