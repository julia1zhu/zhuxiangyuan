// 1.��ʹ�õݹ�ķ�ʽ���쳲�������1,1,2,3.,5,8,13..
//    ����һ������n���������ֵ�Ƕ���

/* ���ӳ���������:��һ�����ӣ����ӵ�һ��������е�һ�룬���ٶ����һ��!
   �Ժ�ÿ����Ӷ������е�һ��,Ȼ���ٶ��һ����
   ������10��ʱ,���ٳ�ʱ(����û��)����ֻ��1�������ˡ�
   ����:��������ٸ�����?                      (4+1)*2 4
  */

public class MethodRecursionExercise01{
	public static void main(String[] args){
	
		Recursion a = new Recursion();
		int res = a.fibonacci(5);
		System.out.print(res);
		
		
		
		System.out.println("�������" + a.peach(1) + "������");
		
		
	}
}

class Recursion {
	public int fibonacci(int n){
		if(n == 1 || n == 2){
			System.out.println(1);
			return 1;
		}else{
			return (fibonacci(n-1) + fibonacci(n-2));	
		}
		
	}
	
/*  ˼·����	
	����ʱ����ʣ���������ǵݹ��ǰ�����
	��ʮ�� 1�����ӣ� 
	�ھ���Ϊ  ��1+1��*2 ������   4
	�ڰ���Ϊ  ��4+1��*2������    9
	������Ϊ  ��9+1��*2������    20
*/

	public int peach(int day){
		if(day == 10){ // ��ʮ��ֻ��һ��������
			return 1;
		}else if(day >= 1 && day <= 9){
			return (peach(day+1)+1)*2;
		}else{
			System.out.println("day�ķ�ΧΪ1-10");
			return -1;
		}
	}
	
}