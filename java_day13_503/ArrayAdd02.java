import java.util.Scanner;
public class ArrayAdd02{
	public static void main(String[] args){
	/* 
		3.用户可以通过如下方法来决定是否继续添加，添加成功，是否继续?y/n
	*/
		int[] arr = {1,2,3};
		Scanner scanner = new Scanner(System.in);
		do{
			int[] arr2 = new int[arr.length + 1];
			for(int i = 0;i < arr.length;i++){
				arr2[i] = arr[i];
			}
			System.out.println("请输入要添加的元素");
			
			arr2[arr.length] = scanner.nextInt();
			arr = arr2;
			
			System.out.println("==============数组扩容后元素情况===================");
			for(int i = 0;i < arr.length;i++){
				System.out.println(arr[i]);
			}
			System.out.println("是否要继续添加  y/n");
			char key = scanner.next().charAt(0);
			if(key == 'n'){
				break;
			}
		}while(true);
		
	}
}
		
	