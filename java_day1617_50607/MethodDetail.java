public class MethodDetail{
	public static void main(String[] args){
		// 1. 一个方法最多有一个返回值，当要返回多个结果时，则返回数组
		AA a = new AA();
		int[] res = a.getSumAndSub(1,4);
		System.out.println("和为" + res[0] + ",差为" + res[1]);
		
		
		//细节:调用带参数的方法时，一定对应着参数列表传入相同类型或兼容类型的参数
		byte b1 = 1;
		byte b2 = 2;
		a. getSumAndSub(b1, b2);//byte -> int
		//a. getSumAndSub(1.1, 1.8);//double ->int(x)

		
	}
}
class AA{
	public int[] getSumAndSub(int n1,int n2){
		
		int resArr[] = new int[2];
		resArr[0] = n1 + n2;
		resArr[1] = n1 - n2;
		return resArr;
	
	// 2.返回类型可以为任意类型，包含引用数据类型（数组、对象）
	}
}