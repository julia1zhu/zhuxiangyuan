public class MethodParameter01{
	public static void main(String[] args){	
		int a = 10;
		int b = 20;
		
		AA obj = new AA();
		obj.swap(a,b);   //两个a,b不冲突，因为调用swap方法参数是应用与另一个空间的
		System.out.println("main方法\na=" + a + "\tb=" + b); // a = 10,b = 20
	}
}

class AA {
	public void swap(int a,int b){
		System.out.println("\na和b交换前的值\na=" + a + "\tb=" + b);  // a = 10,b = 20
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("\na和b交换后的值\na=" + a + "\tb=" + b);  // a = 20,b = 10
	}
}