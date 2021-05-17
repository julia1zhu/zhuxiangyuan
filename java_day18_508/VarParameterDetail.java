public class VarParameterDetail{
	public static void main(String[] args){
		int[] arr = {1,2,3};
		T t = new T();
		t.f1(arr);
		
		
	}
}

class T {
	public void f1(int... nums){
		System.out.println("传入参数长度为" + nums.length);
	}
	
	//4)可变参数可以和普通类型的参数一起放在形参列表，但必须保证可变参数在最后
	public void f1(String str,int... nums){
		System.out.println("传入参数长度为" + nums.length);
	}
	
	// 5)一个形参列表中只能出现一个可变参数
	// public void f2(int... nums,double... nums2)
}