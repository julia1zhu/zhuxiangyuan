public class Array01{
	public static void main(String[] args){
		//1. 定义一个数组
		//   double[]表示是double类型的数组
		double[] hens = {3,5,1,3.4,2,50};
		
		// 2. 遍历整个数组 ，用for循环
		// 我们可以通过 hens[下标]来访问数组的元素
		//下标是从日开始编号的比如第一个元素就是 hens[0],第2个元素就是 hens[1] ，依次类推
		
		double totalWeight = 0;
		for(int i = 0; i < 6;i++ ){
			totalWeight += hens[i];
			System.out.println("第" + (i+1) + "个元素的值是" + hens[i]);
		}
		
		System.out.println("数组的长度为" + hens.length);
	}
}