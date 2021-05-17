
//有一个数组{1，2，3，4，5}，可以将该数组进行缩减，提示用户是否继续缩减，每次缩减最
//后那个元素。当只剩下最后一个元素，提示，不能再缩减。

import java.util.Scanner;
public class ArrayReduce{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5};
		do{
			int[] arrNew = new int[arr.length-1];
			for(int i = 0;i<arr.length-1;i++){
				arrNew[i] = arr[i];
			}
			arr = arrNew;
			if(arr.length != 1){
				System.out.println("可以再进行缩减");
			}else{
				System.out.println("不可以再进行缩减");
				break;
			}
		}while(true);
		
	}
}
		