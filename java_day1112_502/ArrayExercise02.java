public class ArrayExercise02{
	// �����һ������int[]�����ֵ{4,-1,9.10,23}�����õ���Ӧ���±ꡣ
	
	public static void main(String[] args){
		int a[] = {4,-1,9,10,23};
	// �ٶ�max = a[0],maxIndex = 0;
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