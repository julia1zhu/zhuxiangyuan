//  1)打印1—100[学生做]
//  2)计算1—100的和[学生做]
//  3)统计1———200之间能被5整除但不能被3整除的个数
//  4)如果李三不还钱，则老韩将一直使出五连鞭，直到李三说还钱为止[System.out.println(“老韩问:还钱吗?y/n")]


public class DoWhileExercise{
	
	public static void main(String[] args){
		int i = 1;
		int sum = 0;
		do{
			System.out.println(i);
			sum += i;
			i++;
		}while(i<=100);
		System.out.println(sum);
	}
}