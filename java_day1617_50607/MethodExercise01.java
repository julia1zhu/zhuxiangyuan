public class MethodExercise01{
	public static void main(String[] args){	
// 1.��д��AA ��һ������:�ж�һ����������odd����ż��������boolean
// 2.�����С��С��ַ���ӡ��Ӧ�������������ַ�������:��: 4,��: 4,�ַ�#,���ӡ��Ӧ��Ч��
	 AA a = new AA();
	 boolean isOdd = a.oddIf(5);
	 if(isOdd){
		 System.out.println("������");
	 }else{
		 System.out.println("��ż��");
	 }
	 a.print(4,4,'*');
	}
}

class AA{
	public boolean oddIf(int n){
		boolean flag;
		if(n%2==0){
			flag = false;
		}else{
			flag = true;
		}
		return flag;
	}
	
	
	//�����С��С��ַ���ӡ��Ӧ�������������ַ�,
	//����U��:4����:4���ַ�#,���ӡ��Ӧ��Ч��/*
	/*####
	  ####
	  ####
	  ####
	  */
	
	//˼·
	//1�������ķ�������void
	//2������������print
	//3���������β�(int row,int col,char c)
	//4�������壺ѭ��
	
	public void print(int row,int col,char c){
		for(int i = 1;i <= row;i++){
			for(int j = 1;j <= col;j++){
				System.out.print(c);
			}
			System.out.println();
		}
	}
	
}	
	

/*  if(n%2==0){
		return false;
	}else{
		return true;
	}
	
	
	����return num%2 != ;0 ? true:false;
	
	����return num%2 != 0;
	
	
	
*/