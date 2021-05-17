public class BubbleSort{
	public static void main(String[] args){
		// 我们将五个无序:24,69,80,57,13使用冒泡排序法将其排成一个从小到大的有序数列。
		int[] arr = {24,69,80,57,13};
		int temp;
		for(int j = 1;j<arr.length;j++){
			for(int i = 0;i < arr.length-j;i++){
				if(arr[i]>arr[i+1]){
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
			System.out.println("第" + j + "次排序后的数组元素");
			for(int i = 0;i < arr.length;i++){
				System.out.print(arr[i] + " " );
			}
			System.out.println();
		}
		
	}
}

//  但是事实上如果得出了最后一个大的数字，最后一个数字是不需要比较的，依次类推。