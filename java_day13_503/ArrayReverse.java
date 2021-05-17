public class ArrayReverse{
	public static void main(String[] args){
		int[] arr = {11,22,33,44,55,66};
		int temp = 0;
		// 数据如何能够交换
		// 交换次数要注意，否则交换过来又交换回去了
		for(int i = 0;i < arr.length/2;i++){
			temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		
		System.out.println("=============翻转后数组================");
		for(int i = 0;i < arr.length;i++){
			System.out.println(arr[i]);
		}
		
	}
}

