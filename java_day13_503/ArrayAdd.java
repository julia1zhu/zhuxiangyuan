public class ArrayAdd{
	public static void main(String[] args){
	/*  Ҫ��:ʵ�ֶ�̬�ĸ���������Ԫ��Ч����ʵ�ֶ��������ݡ�ArrayAdd.java1.ԭʼ����ʹ�þ�̬����int[] arr = {1,2,3}
		2.���ӵ�Ԫ��4,ֱ�ӷ�����������arr = {1,2,3,4}
		3.�û�����ͨ�����·����������Ƿ�������ӣ����ӳɹ����Ƿ����?y/n
		
		˼·����
		1�������ʼ����int[]arr ={1,2,3}//�±�0-2
		2������һ���µ�����int[] arrNew = new int[ arr.length+1];3������arr���飬���ν�arr��Ԫ�ؿ�����arrNew����
		4����4����arrNew[ arrNew.length - 1]= 4;��4����arrNew���һ��Ԫ��5.�� arr ָ��arrNew ; arr = arrNew;��ôԭ��arr����ͱ�����
	*/
		int[] arr = {1,2,3};
		int[] arr2 = new int[arr.length + 1];
		for(int i = 0;i < arr.length;i++){
			arr2[i] = arr[i];
		}
		arr2[arr.length] = 4;
		arr = arr2;
		
		System.out.println("==============�������ݺ�Ԫ�����===================");
		for(int i = 0;i < arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}