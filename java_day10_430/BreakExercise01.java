//1)1-100以内的数求和，求出当和第一次大于20的当前数【for + break】


public class BreakExercise01{
	public static void main(String[] args){
		int count = 0;
		for(int i = 1;i <= 100;i++){
			count += i;
			if(count > 20){
				System.out.println(i);
				break;
			}
		}
	}
}