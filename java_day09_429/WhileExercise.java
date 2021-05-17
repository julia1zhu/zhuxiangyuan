//  1.打印1—100之间所有能被3整除的数[使用while）
//  2.打印40—200之间所有的偶数[使用while循环）

public class WhileExercise{
	
	public static void main(String[] args){
		int i = 1;
		int a = 40;
		while(i <= 100){
			if(i%3==0){
				System.out.println(i);
			}
			
			i++;
		}
		
		while(a <= 200){
			if(a%2==0){
				System.out.println(a);
			}
			a++;
		}
		
		
	}
}
