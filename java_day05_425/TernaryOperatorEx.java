public class TernaryOperatorEx{
	
	public static void main(String[] args){
		//案例:实现三个数的最大值
		int n1 = 553;
		int n2 = 33;
		int n3 = 123;
		//思路
		//1．先得到n1和n2中最大数,保存到max1
		//2．然后再求出max1和n3中的最大数，保存到max2
		
		int max1 = n1 > n2 ? n1 : n2;
		int max2 = max1 > n3 ? max1 : n3;
		System.out.println("最大数=" + max2);
		
		//使用一条语句实现,推荐使用上面方法
		int max = (n1 > n2 ? n1 : n2) > n3 ?
					(n1 > n2 ? n1 : n2) : n3;
		System.out.println("最大数=" + max);

	}
}