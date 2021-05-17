//1.编写类A01，定义方法max，实现求某个double数组的最大值，并返回
  public class HomeWork01{
	  public static void main(String[] args){
		  double[] arr = {1.0,5.7,9.4};
		 //  1. double[] arr = {};
		 //  2. double[] arr = null;
		 
		  A01 a = new A01();
		  Double res = a.max(arr);
		  if(res != null){
			  System.out.println("数组中的最大值为 " + a.max(arr));
		  }else{
			  System.out.println("arr的输入有误，数组不能为null，或者{}");
		  }
	  }
  }

// 先完成正常业务，再考虑代码的健壮性 ：例如数组中没有元素
 class A01 {
	 public Double max (double[] arr){   // 返回值是包装类，针对第一种情况
		if(arr != null && arr.length > 0){ // 针对于第二种情况
			double max = arr[0];
			 for (int i = 1;i < arr.length;i++){
				 if(arr[i] > max){
					 max = arr[i];
				 }
			 }
			 return max;  //double
		}else{
			return null;
		}
	 }
 }
 