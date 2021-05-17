public class HomeWork06{
	public static void main(String[] args){
	// 6.试写出以下代码的打印结果
		
		char[] arr1 = {'a','z','b','c'};
	    char[] arr2 = arr1;
		
		arr1[2] = '韩';    // a z 韩 c
		for(int i = 0;i < arr2.length;i++){
			System.out.println(arr1[i] + "," + arr2[i]); 
		}
		// a,a z,z 韩,韩 c,c
	}
}