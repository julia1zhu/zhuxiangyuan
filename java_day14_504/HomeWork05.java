public class HomeWork05{
	public static void main(String[] args){
		//随机生成10个整数(1-100的范围)保存到数组
		//并倒序打印以及求平均值、求最大值和最大值的下标、并查找里面是否有8 
		// 随机生成  (int)Math.random()*100 + 1
		int maxNum = 0;
		double sum = 0;
		int index = -1;
		int flag = -1;
		int[] arr = new int[10];
		for(int i = 0;i < arr.length;i++){
			// 随机生成10个整数
			arr[i] = (int)(Math.random()*100)+ 1;
		}
		// 逆序打印
		for(int i = arr.length-1;i >= 0;i--){
			System.out.print(arr[i] + "  ");
			
			// 求总值
			sum += arr[i];
			
			// 寻找最大值
			if(arr[i] > maxNum){
				maxNum = arr[i];
				index = i;
			}
		}
		for(int i = 0;i < arr.length;i++){
			if(arr[i] == 8){
				System.out.println("数组里面有8");
				flag == 1;
				break;
			}
		}
		if(flag == -1){
			System.out.println("数组里面没有8");
		}
		System.out.println("数组的平均值为" + sum/10);	
		System.out.println("最大值为" + maxNum + "  最大值的小标为" + index);
			
	}
		
}

