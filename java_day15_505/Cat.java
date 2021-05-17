//张老太养了两只猫猫:一只名字叫小白,今年3岁,白色。
//还有一只叫小花,今年100岁,花色。
//请编写一个程序,当用户输入小猫的名字时,就显示该猫的名字，年龄，颜色。
//如果用户输入的小猫名错误，则显示张老太没有这只猫猫。


//  单独变量来解决 =》不利于数据的管理（一只猫的信息拆解了）
import java.util.Scanner;
public class Cat{
	public static void main(String[] args){
		String cat1 = "小白";
		int age1 = 3;
		String color1 = "白色";
		
		String cat2 = "小花";
		int age2 = 100;
		String color2 = "花色";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入小猫的名字");
		String name = scanner.next();
		if(name.equals(cat1)){
			System.out.println(cat1 + "现在" + age1 + "岁了，是一只" 
								+ color1 + "的小猫");
			
		}else if(name.equals(cat2)){
			System.out.println(cat2 + "现在" + age2 + "岁了，是一只" 
								+ color2 + "的小猫");
		}else{
			System.out.println("张老太没有这只小猫");
		}
	
	}
}



// 数组=====> 1） 数据类型体现不出来   2)只能通过下标获取信息，造成变量名字和内容的
			//                           对应关系不明确
			// 3) 不能体现猫的变化

// 第一只猫信息
//  String[] cat1 = {"小白","3","白色"};  cat[1]