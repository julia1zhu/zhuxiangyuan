public class VarParameterDetail{
	public static void main(String[] args){
		int[] arr = {1,2,3};
		T t = new T();
		t.f1(arr);
		
		
	}
}

class T {
	public void f1(int... nums){
		System.out.println("�����������Ϊ" + nums.length);
	}
	
	//4)�ɱ�������Ժ���ͨ���͵Ĳ���һ������β��б������뱣֤�ɱ���������
	public void f1(String str,int... nums){
		System.out.println("�����������Ϊ" + nums.length);
	}
	
	// 5)һ���β��б���ֻ�ܳ���һ���ɱ����
	// public void f2(int... nums,double... nums2)
}