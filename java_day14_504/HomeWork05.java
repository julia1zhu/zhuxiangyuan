public class HomeWork05{
	public static void main(String[] args){
		//�������10������(1-100�ķ�Χ)���浽����
		//�������ӡ�Լ���ƽ��ֵ�������ֵ�����ֵ���±ꡢ�����������Ƿ���8 
		// �������  (int)Math.random()*100 + 1
		int maxNum = 0;
		double sum = 0;
		int index = -1;
		int flag = -1;
		int[] arr = new int[10];
		for(int i = 0;i < arr.length;i++){
			// �������10������
			arr[i] = (int)(Math.random()*100)+ 1;
		}
		// �����ӡ
		for(int i = arr.length-1;i >= 0;i--){
			System.out.print(arr[i] + "  ");
			
			// ����ֵ
			sum += arr[i];
			
			// Ѱ�����ֵ
			if(arr[i] > maxNum){
				maxNum = arr[i];
				index = i;
			}
		}
		for(int i = 0;i < arr.length;i++){
			if(arr[i] == 8){
				System.out.println("����������8");
				flag == 1;
				break;
			}
		}
		if(flag == -1){
			System.out.println("��������û��8");
		}
		System.out.println("�����ƽ��ֵΪ" + sum/10);	
		System.out.println("���ֵΪ" + maxNum + "  ���ֵ��С��Ϊ" + index);
			
	}
		
}

