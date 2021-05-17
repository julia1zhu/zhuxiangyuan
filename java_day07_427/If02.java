import java.util.Scanner;

public class If02{
	// 编写一个程序,可以输入人的年龄,如果该同志的年龄大于18岁,
	// 则输出"你年龄大于18,要对自己的行为负责,送入监狱”，否则，输出“对你从轻处罚”

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年龄");
		int age = scanner.nextInt();
		
		if(age > 18){
			System.out.println("你年龄大于18.要对自己的行为负责"); 
		}
		else{
			System.out.println("对你从轻处罚");
		}
		System.out.println("程序继续");
	}
}