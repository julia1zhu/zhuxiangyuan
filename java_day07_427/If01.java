import java.util.Scanner;
public class If01{
	// 编写一个程序,可以输入人的年龄,如果该同志的年龄大于18岁,
	// 则输出"你年龄大于18,要对自己的行为负责,送入监狱”

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年龄");
		int age = scanner.nextInt();
		if(age > 18){
			System.out.println("你年龄大于18.要对自己的行为负责"); 
		}
		System.out.println("程序继续");
	}
}