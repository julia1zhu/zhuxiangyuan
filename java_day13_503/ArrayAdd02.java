import java.util.Scanner;
public class ArrayAdd02{
	public static void main(String[] args){
	/* 
		3.�û�����ͨ�����·����������Ƿ������ӣ���ӳɹ����Ƿ����?y/n
	*/
		int[] arr = {1,2,3};
		Scanner scanner = new Scanner(System.in);
		do{
			int[] arr2 = new int[arr.length + 1];
			for(int i = 0;i < arr.length;i++){
				arr2[i] = arr[i];
			}
			System.out.println("������Ҫ��ӵ�Ԫ��");
			
			arr2[arr.length] = scanner.nextInt();
			arr = arr2;
			
			System.out.println("==============�������ݺ�Ԫ�����===================");
			for(int i = 0;i < arr.length;i++){
				System.out.println(arr[i]);
			}
			System.out.println("�Ƿ�Ҫ�������  y/n");
			char key = scanner.next().charAt(0);
			if(key == 'n'){
				break;
			}
		}while(true);
		
	}
}
		
	