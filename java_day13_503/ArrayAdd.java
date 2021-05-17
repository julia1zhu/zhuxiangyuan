public class ArrayAdd{
	public static void main(String[] args){
	/*  要求:实现动态的给数组添加元素效果，实现对数组扩容。ArrayAdd.java1.原始数组使用静态分配int[] arr = {1,2,3}
		2.增加的元素4,直接放在数组的最后arr = {1,2,3,4}
		3.用户可以通过如下方法来决定是否继续添加，添加成功，是否继续?y/n
		
		思路分析
		1．定义初始数组int[]arr ={1,2,3}//下标0-2
		2．定义一个新的数组int[] arrNew = new int[ arr.length+1];3．逼历arr数组，依次将arr的元秦拷贝到arrNew数组
		4．将4赋给arrNew[ arrNew.length - 1]= 4;把4赋给arrNew最后一个元素5.让 arr 指向arrNew ; arr = arrNew;那么原来arr数组就被销毁
	*/
		int[] arr = {1,2,3};
		int[] arr2 = new int[arr.length + 1];
		for(int i = 0;i < arr.length;i++){
			arr2[i] = arr[i];
		}
		arr2[arr.length] = 4;
		arr = arr2;
		
		System.out.println("==============数组扩容后元素情况===================");
		for(int i = 0;i < arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}