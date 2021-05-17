//编程，实现如下效果
// 姓名   年龄    成绩   性别   爱好
// ××      ××      ××     ××     ××

//要求： 
// 1.用变量将姓名、年龄、成绩、性别、爱好存储
// 2.使用+
// 3.添加适当的注释
// 4.添加转义字符，使用一条语句输出

public class Homework04{
	
	// 编写一个主方法
	public static void main(String[] args){
	
	// 声明变量并且赋值
		String str1 = "姓名";
		String str2 = "年龄";
		String str3 = "成绩";
		String str4 = "性别";
		String str5 = "爱好";
		
		String name = "朱香原";
		int age = 21;
		int grade = 95;
		char gender = '女';
		String hobby = "听歌儿~";
		
	//输出语句
		System.out.println(str1 + "\t" + str2 + "\t" + str3 + "\t" + str4 + "\t" + str5 + "\n"
		+ name + "\t" + age + "\t" + grade + "\t" + gender + "\t" +hobby);
		
	}
}