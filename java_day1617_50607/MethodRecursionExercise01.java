// 1.请使用递归的方式求出斐波那契数1,1,2,3.,5,8,13..
//    给你一个整数n，求出它的值是多少

/* 猴子吃桃子问题:有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个!
   以后每天猴子都吃其中的一半,然后再多吃一个。
   当到第10天时,想再吃时(即还没吃)发现只有1个桃子了。
   问题:最初共多少个桃子?                      (4+1)*2 4
  */

public class MethodRecursionExercise01{
	public static void main(String[] args){
	
		Recursion a = new Recursion();
		int res = a.fibonacci(5);
		System.out.print(res);
		
		
		
		System.out.println("最初共有" + a.peach(1) + "个桃子");
		
		
	}
}

class Recursion {
	public int fibonacci(int n){
		if(n == 1 || n == 2){
			System.out.println(1);
			return 1;
		}else{
			return (fibonacci(n-1) + fibonacci(n-2));	
		}
		
	}
	
/*  思路分析	
	变量时桃子剩余数，但是递归是按天数
	第十天 1个桃子， 
	第九天为  （1+1）*2 个桃子   4
	第八天为  （4+1）*2个桃子    9
	第七天为  （9+1）*2个桃子    20
*/

	public int peach(int day){
		if(day == 10){ // 第十天只有一个桃子了
			return 1;
		}else if(day >= 1 && day <= 9){
			return (peach(day+1)+1)*2;
		}else{
			System.out.println("day的范围为1-10");
			return -1;
		}
	}
	
}