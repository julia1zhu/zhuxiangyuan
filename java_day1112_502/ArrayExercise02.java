public class ArrayExercise02{
	// 请求出一个数组int[]的最大值{4,-1,9.10,23}，并得到对应的下标。
	
	public static void main(String[] args){
		int a[] = {4,-1,9,10,23};
	// 假定max = a[0],maxIndex = 0;
		int maxNum = a[0];
		int maxIndex = 0;
		for(int i = 1;i<a.length;i++){
			if(a[i]>maxNum){
				maxNum = a[i];
				maxIndex = i;
			}
	    }

	}
}