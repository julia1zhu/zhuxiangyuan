public class MethodDetail{
	public static void main(String[] args){
		// 1. һ�����������һ������ֵ����Ҫ���ض�����ʱ���򷵻�����
		AA a = new AA();
		int[] res = a.getSumAndSub(1,4);
		System.out.println("��Ϊ" + res[0] + ",��Ϊ" + res[1]);
		
		
		//ϸ��:���ô������ķ���ʱ��һ����Ӧ�Ų����б�����ͬ���ͻ�������͵Ĳ���
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
	
	// 2.�������Ϳ���Ϊ�������ͣ����������������ͣ����顢����
	}
}