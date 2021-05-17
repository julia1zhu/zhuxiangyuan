public class HomeWork04{
	public static void main(String[] args){
		//4.已知有个升序的数组，要求插入一个元素，该数组顺序依然是升序
		// 如:[10，12，45，90]，添加23后,数组为[10，12，23，45，90]
		
		// 思路，首先数组需要扩容，其次，需要保持升序。
		
		int[] arr = {10,12,45,90};
		
		int[] arrAdd = new int[arr.length+1];
		for(int i = 0;i < arr.length;i++){
			arrAdd[i] = arr[i];
		}
		arrAdd[arr.length] = 23;
		arr = arrAdd;
	
		int temp = 0;
		for(int i = arr.length-1;i > 0;i--){
			if(arr[i] < arr[i-1]){
				temp = arr[i];
				arr[i] = arr[i-1];
				arr[i-1] = temp;
			}
			
		}
		System.out.println("===============添加元素后重新排序的数组===============");
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		
	}
}