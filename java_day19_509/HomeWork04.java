// 4.编写类A03,实现数组的复制功能copyArr，输入旧数组，返回一个新数组，元素和旧数组一样

 
 public class HomeWork04{
	  public static void main(String[] args){
		  int[] arr1 = {1,2,3};
		  A03 a = new A03();
		  System.out.println("===================原来的数组为=============");
		  for(int i = 0;i < arr1.length;i++){
			  System.out.print(arr1[i] + " ");
		  }
		  System.out.println();
		  
		  System.out.println("===================返回的新数组为=============");
		  for(int i = 0;i < a.copyArr(arr1).length;i++){
			  System.out.print(a.copyArr(arr1)[i] + " ");
		  }
	  }
 }
 
 
 
 class A03 { 
	 
	 public int[] copyArr(int[] arr1){
		 int[] arr2 = new int[arr1.length];
		 for(int i = 0;i < arr1.length;i++){
			 arr2[i] = arr1[i];
		 }
		 return arr2;
	 } 
	  
 }