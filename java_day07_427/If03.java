// 输入保国同志的芝麻信用分:如果:
/*	1．信用分为100分时,输出信用极好;
	2.信用分为(80，99]时,输出信用优秀;
	3.信用分为[60,80]时,输出信用一般;
	4.其它情况,输出信用不及格
	5.请从键盘输入保国的芝麻信用分,并加以判断
*/

import java.util.Scanner;
public class If03{
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入保国同志的芝麻信用分（1-100）");
		int creditGrade = scanner.nextInt();
		
		if(creditGrade >=1 && creditGrade <=100){  // 但是如果输入100.也会输出“信用不及格”,所以有如下改变
			if(creditGrade == 100){
				System.out.println("信用极好");
			}
			else if(creditGrade > 80 && creditGrade <= 99){
				System.out.println("信用优秀");
			}
			else if(creditGrade >= 60 && creditGrade <= 80){
				System.out.println("信用一般");
			}
			else {
				System.out.println("信用不及格");
			}
		}else{
			System.out.println("信用分需要在1-100之内，请重新输入");
		}
	}
}

