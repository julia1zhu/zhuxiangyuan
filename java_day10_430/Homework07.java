//  7.输出小写的a-z以及大写的Z-A


public class Homework07{
	public static void main(String[] args){
		for(char c1 = 'a';c1 <= 'z';c1++){
			System.out.println(c1);
		}
		for(char c2 = 'Z';c2 >= 'A';c2--){
			System.out.println(c2);
		}
	}
} 