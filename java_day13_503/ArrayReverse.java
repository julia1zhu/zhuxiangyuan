public class ArrayReverse{
	public static void main(String[] args){
		int[] arr = {11,22,33,44,55,66};
		int temp = 0;
		// ��������ܹ�����
		// ��������Ҫע�⣬���򽻻������ֽ�����ȥ��
		for(int i = 0;i < arr.length/2;i++){
			temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		
		System.out.println("=============��ת������================");
		for(int i = 0;i < arr.length;i++){
			System.out.println(arr[i]);
		}
		
	}
}

