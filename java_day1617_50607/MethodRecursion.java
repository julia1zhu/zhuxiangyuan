public class MethodRecursion{
	public static void main(String[] args){
		
		T t = new T();
		t.test(3);
		int res = t.factorial(5);
		System.out.println(res);
			
	}
}

class T {
//Êä³öÊ²Ã´?    
/*
  n=2
  n=3
 */
	public void test(int n){
		if (n >2){
			test(n - 1);
		}
		System.out.println("n=" + n);
	}
	
//½×³Ë
	public int factorial(int n)	{
		if (n == 1) {
			return 1;
		}else {
			return factorial(n - 1)* n;
		}
	}
}