public class TwoDimensionalArray01{
	public static void main(String[] args){
		/*
		���ö�ά�����������ͼ��
		0 0 0 0 0 0
		0 0 1 0 0 0
		0 2 0 3 0 0
		0 0 0 0 0 0
		*/
		
		int[][] arr = {{0,0,0,0,0,0},{0,0,1,0,0,0},
						{0,2,0,3,0,0},{0,0,0,0,0,0}};
						
		//����һά����Ĺؼ�����
		//(1)
		System.out.println("��ά�����Ԫ�ظ��� = " + arr.length);
		//(2)��ά�����ÿ��Ԫ����һά���飬���������Ҫ�õ�ÿ��һά�����ֵ
		//����Ҫ�ٴα���
		//(3) �������Ҫ���ʵ�(i+1)��һά����ĵ�j+1��ֵarr[i][j];
		
		for(int i = 0;i < arr.length;i++){
			//1. arr[i]��ʾ��ά����ĵ�i+1��Ԫ�ر���arr[0]:��ά����ĵ�һ��Ԫ��
			//2. arr[i].length�õ���Ӧ��ÿ��һά����ĳ���
			for(int j = 0;j<arr[i].length;j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}