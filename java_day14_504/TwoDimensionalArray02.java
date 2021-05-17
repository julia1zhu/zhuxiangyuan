public class TwoDimensionalArray02{
	public static void main(String[] args){
		/*
		看一个需求:动态创建下面二维数组，并输出
		i = 0: 1
		i = 1: 2  2
		i = 2: 3  3   3
		*/
		
		// 一共有三个一维数组，但是每个一维数组的元素是不一样的
		int[][] arr = new int[3][];
		for(int i = 0;i < arr.length;i++){
			// 给每个一维数组开空间new
			// 如果没有给一堆数组new，那么arr[i]就是null
			arr[i] = new int[i+1];
			for(int j = 0;j < arr[i].length;j++){
				arr[i][j] = 1 + i;
			}
		}
		
		for(int i = 0;i < arr.length;i++){
			for(int j = 0;j < arr[i].length;j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}