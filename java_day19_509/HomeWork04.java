// 4.��д��A03,ʵ������ĸ��ƹ���copyArr����������飬����һ�������飬Ԫ�غ;�����һ��

 
 public class HomeWork04{
	  public static void main(String[] args){
		  int[] arr1 = {1,2,3};
		  A03 a = new A03();
		  System.out.println("===================ԭ��������Ϊ=============");
		  for(int i = 0;i < arr1.length;i++){
			  System.out.print(arr1[i] + " ");
		  }
		  System.out.println();
		  
		  System.out.println("===================���ص�������Ϊ=============");
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