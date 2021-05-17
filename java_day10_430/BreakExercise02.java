//2)实现登录验证，有3次机会，如果用户名为"丁真”,密码"666"提示登录成功,
//  否则提示还有几次机会，请使用for+ break完成
import java.util.Scanner;
public class BreakExercise02{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		for(int i = 1;i <= 3;i++){
			System.out.println("请输入用户名");
			String user = scanner.next();
			
			System.out.println("请输入密码");
			String password = scanner.next();
			
			//  if(user == "丁真" && password == "666"){
			//  字符串的内容比较的方法 
			
			if(user.equals("丁真")&&"666".equals(password)){//推荐第二种写法，可以避免空指针问题
				System.out.println("登录成功");
				break;
			}
			System.out.println("登录失败，还有" + (3 - i) + "次机会");
		}
	}
}