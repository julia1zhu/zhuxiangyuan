// 完成下面的表达式输出
// 0 + 5 =5
// 1 + 4 =5
// 2 + 3 =5
// 3 + 2 =5
// 4 + 1 =5
// 5 + 0 =5

// 化繁为简
//  (1)先输出0-5
//  (2) 后面的+是 （5-i）

//  先死后活
//  把5换成n
public class ForExercise02{
	public static void main(String[] args){
		int n = 5;
		for(int i = 0;i <= n ;i++){
			System.out.println(i + "+" + (5-i) + "=" + n);
		}
	}
}