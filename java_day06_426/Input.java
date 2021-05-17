import java.util.Scanner;//1. 表示把java.util下的Scanner类导入

public class Input{
	
	public static void main(String[] args){
		//演示接受用户的输入
		// 2. 创建 Scanner对象
		
		Scanner scanner = new Scanner(System.in);
		
		// 3. 接受用户输入，使用相关方法
		System.out.println("请输入你的姓名");
		String name = scanner.next(); //如果这里不输入，程序就会一直停留在这里
		
		System.out.println("请输入你的年龄");
		int age = scanner.nextInt();
		
		System.out.println("请输入你的薪水");
		double salary = scanner.nextDouble();
		
	}
}