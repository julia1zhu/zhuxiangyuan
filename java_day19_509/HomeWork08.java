


public class HomeWork08 {  // 10,9,10
	
	int count = 9;
	
	public void count1(){
		count = 10;
		System.out.println("count1=" + count);
	}
	
	public void count2(){
		System.out.println("count1=" + count++);
	}
	
	// ����main�������κ�һ���඼������������
	public static void main(String[] args){
		
		// 1. new HomeWork08()�����������ص㣺ֻ����һ�Σ�ʹ�ú�Ͳ�����ʹ��
		new HomeWork08().count1();
		HomeWork08 t1 = new HomeWork08();
		t1.count2();
		t1.count2();
	}
}