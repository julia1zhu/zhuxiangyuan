// 两个编程思想
//1．化繁为简:即将复杂的需求，拆解成简单的需求，逐步完成
// 打印1~100之间所有是9的倍数的整数，统计个数及总和.
// 1） 打印出1-100
// 2） 在输出的过程中，进行过滤，只输出9的倍数
// 3） 统计个数，定义一个变量 int n =0，当条件满足时，就n++
// 4） 求出总和，定义一个变量，int sum = 0， 当条件满足时

//2．先死后活︰先考虑固定的值，然后转成可以灵活变化的值
//  （1）为了适应更好的需求，把范围的开始的值和结束的值作为一个变量，那么适应范围更广
//   (2) 还可以将9 的倍数也做成变量

public class ForExercise01{
	public static void main(String[] args){
		
		int n = 0;
		int sum = 0;
		int strat = 1;
		int end = 100;
		for(int i = strat;i<=end;i++){
			if(i%9 ==0){
				System.out.println(i);	
				n++;
				sum += i;
			}	
		}

		System.out.println("是9的倍数的整数共有" + n + "个,总和为" + sum);
		
	}
}
	