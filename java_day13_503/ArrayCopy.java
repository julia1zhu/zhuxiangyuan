public class ArrayCopy{
	public static void main(String[] args){
		//将 int[] arr1 = {10,20,30};拷贝到arr2数组
		// 要求数据空间是独立的·
		int[] arr1 = {10,20,30};
		
		//创建一个新的数组arr2，开辟新的数据空间
		int[] arr2 = new int[arr1.length];
		
		for(int i = 0;i < arr1.length;i++){
			arr2[i] = arr1[i];
		}
		
		// 修改arr2的值
		arr2[0] = 0;
		
		// 输出arr1的值
		System.out.println("============arr1的值===============");
		for(int i = 0;i < arr1.length;i++){
			System.out.println(arr1[i]);
		}
		
		// 输出arr2的值
		System.out.println("============arr1的值===============");
		for(int i = 0;i < arr2.length;i++){
			System.out.println(arr2[i]);
		}
	}
}