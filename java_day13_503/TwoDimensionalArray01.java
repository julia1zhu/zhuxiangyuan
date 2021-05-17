public class TwoDimensionalArray01{
	public static void main(String[] args){
		/*
		请用二维数组输出如下图形
		0 0 0 0 0 0
		0 0 1 0 0 0
		0 2 0 3 0 0
		0 0 0 0 0 0
		*/
		
		int[][] arr = {{0,0,0,0,0,0},{0,0,1,0,0,0},
						{0,2,0,3,0,0},{0,0,0,0,0,0}};
						
		//关于一维数组的关键概念
		//(1)
		System.out.println("二维数组的元素个数 = " + arr.length);
		//(2)二维数组的每个元素是一维数组，所以如果需要得到每个一维数组的值
		//还需要再次遍历
		//(3) 如果我们要访问第(i+1)个一维数组的第j+1个值arr[i][j];
		
		for(int i = 0;i < arr.length;i++){
			//1. arr[i]表示二维数组的第i+1个元素比如arr[0]:二维数组的第一个元素
			//2. arr[i].length得到对应的每个一维数组的长度
			for(int j = 0;j<arr[i].length;j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}