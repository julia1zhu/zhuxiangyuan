public class MethodParameter01{
	public static void main(String[] args){	
		int a = 10;
		int b = 20;
		
		AA obj = new AA();
		obj.swap(a,b);   //����a,b����ͻ����Ϊ����swap����������Ӧ������һ���ռ��
		System.out.println("main����\na=" + a + "\tb=" + b); // a = 10,b = 20
	}
}

class AA {
	public void swap(int a,int b){
		System.out.println("\na��b����ǰ��ֵ\na=" + a + "\tb=" + b);  // a = 10,b = 20
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("\na��b�������ֵ\na=" + a + "\tb=" + b);  // a = 20,b = 10
	}
}