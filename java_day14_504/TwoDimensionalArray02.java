public class TwoDimensionalArray02{
	public static void main(String[] args){
		/*
		��һ������:��̬���������ά���飬�����
		i = 0: 1
		i = 1: 2  2
		i = 2: 3  3   3
		*/
		
		// һ��������һά���飬����ÿ��һά�����Ԫ���ǲ�һ����
		int[][] arr = new int[3][];
		for(int i = 0;i < arr.length;i++){
			// ��ÿ��һά���鿪�ռ�new
			// ���û�и�һ������new����ôarr[i]����null
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