public class ArrayCopy{
	public static void main(String[] args){
		//�� int[] arr1 = {10,20,30};������arr2����
		// Ҫ�����ݿռ��Ƕ����ġ�
		int[] arr1 = {10,20,30};
		
		//����һ���µ�����arr2�������µ����ݿռ�
		int[] arr2 = new int[arr1.length];
		
		for(int i = 0;i < arr1.length;i++){
			arr2[i] = arr1[i];
		}
		
		// �޸�arr2��ֵ
		arr2[0] = 0;
		
		// ���arr1��ֵ
		System.out.println("============arr1��ֵ===============");
		for(int i = 0;i < arr1.length;i++){
			System.out.println(arr1[i]);
		}
		
		// ���arr2��ֵ
		System.out.println("============arr1��ֵ===============");
		for(int i = 0;i < arr2.length;i++){
			System.out.println(arr2[i]);
		}
	}
}