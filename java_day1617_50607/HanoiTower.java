public class HanoiTower{
	
		//��д һ��main����
	public static void main(String[] args) {
		Tower tower = new Tower( );
		tower.move(5,'A','B','C' );

	}
}

class Tower {
	//����
	//num ��ʾҪ�ƶ��ĸ�����a, b, C�ֱ��ʾA����B����C��
	public void move( int num,char a, char b ,char c) {
	//���ֻ��һ����num = 1
		if(num == 1){
		System.out.println(a + "->" + c);
		}else{
			//����ж���̣����Կ���������������ĺ������������(num-1)
			//(1)���ƶ��������е��̵�b,����C
			move (num-1,a,c,b);
			//(2)�������������̣��ƶ���C
			System. out . println(a + "->" + c);
			//(3)�ٰ�b���������̣��ƶ���C ,����a
			move(num - 1,b,a,c);
		}
	}
}
