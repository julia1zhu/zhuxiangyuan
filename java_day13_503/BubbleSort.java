public class BubbleSort{
	public static void main(String[] args){
		// ���ǽ��������:24,69,80,57,13ʹ��ð�����򷨽����ų�һ����С������������С�
		int[] arr = {24,69,80,57,13};
		int temp;
		for(int j = 1;j<arr.length;j++){
			for(int i = 0;i < arr.length-j;i++){
				if(arr[i]>arr[i+1]){
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
			System.out.println("��" + j + "������������Ԫ��");
			for(int i = 0;i < arr.length;i++){
				System.out.print(arr[i] + " " );
			}
			System.out.println();
		}
		
	}
}

//  ������ʵ������ó������һ��������֣����һ�������ǲ���Ҫ�Ƚϵģ��������ơ�