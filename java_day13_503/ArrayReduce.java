
//��һ������{1��2��3��4��5}�����Խ������������������ʾ�û��Ƿ����������ÿ��������
//���Ǹ�Ԫ�ء���ֻʣ�����һ��Ԫ�أ���ʾ��������������

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
				System.out.println("�����ٽ�������");
			}else{
				System.out.println("�������ٽ�������");
				break;
			}
		}while(true);
		
	}
}
		