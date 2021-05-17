// 3.【课后自己练】定义两个变量int,判断二者的和，是否能被3又能被5整除,打印提示信息


// 单分支和双分支练习
public class IfExercise02{
	
	public static void main(String[] args){
		int n1 = 39;
		int n2 = 18;
		
		if((n1+n2)%3==0 && (n1+n2)%5==0){
			System.out.println("这两个变量的和能被3又能被5整除");
		}
		System.out.println("这两个变量的和不能同时被3和5整除");
	}
}