// 算术运算符的面试题

// 1. 假如还有59天放假，问:合xx个星期零xx天
// 2. 定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为:  5/9*(华氏温度-100),
//    请求出华氏温度对应的摄氏温度。[234.5]

public class ArithmeticOperatorExercise02{
	public static void main(String[] args){
		
		//1. 
		int days = 59;
		int week ;
		int leftdays;
		week = days / 7;
		leftdays = days % 7;
		System.out.println("合" + week + "个星期零" + leftdays + "天");
		
		// 2. 这样子计算结果是0.0
		double f = 234.5;
		double c;
		c = 5 / 9 * (f - 100);
		System.out.println(c);
		
		double f1 = 234.5;
		double c1;
		// 要考虑计算机语言与数学之间的关系
		c1 = 5.0 / 9 * (f1 - 100);
		System.out.println(c1);
	}
}