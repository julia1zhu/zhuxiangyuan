//�����У��з���sum�����Լ���2�����ĺͣ�3�����ĺͣ�4������5


public class VarParameter01{
	public static void main(String[] args){
			Methods m = new Methods();
			System.out.println("��Ϊ" + m.sum(3,4,5));
	}
}

class Methods{
	public int sum(int n1,int n2){
		return n1 + n2;	
	}
	public int sum(int n1,int n2,int n3){
		return n1 + n2 + n3;	
	}
	public int sum(int n1,int n2,int n3,int n4){
		return n1 + n2 + n3 + n4;	
	}
	
//�������������������ͬ��������ͬ������������ͬ->ʹ�ÿɱ�����Ż�
//1. int...��ʾ���ܵ��ǿɱ������������int ,�����Խ��ն��int(0-��)
// 2.ʹ�ÿɱ������ʱ�򣬿��Ե���������ʹ�ã���nums���Ե�������
	public int sum(int... nums){
		System.out.println("���յĲ�������=" + nums.length);
		int res = 0;
		for(int i = 0;i < nums.length;i++){
			res += i;
		}
		return res;
	}

}