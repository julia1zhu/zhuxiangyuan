public class MiGong{
	public static void main(String[] args){
	//˼·
	//1���ȴ����Թ����ö�ά�����ʾ int[][] map = new int[8][7];
	//2���ȹ涨 map�����Ԫ��ֵ:0��ʾ������;1��ʾ�ϰ���

		int[][] map = new int[8][7];
		// 3.��������һ�к�������һ��ȫ������Ϊ1
		for(int j = 0;j < 7;j++){
			map[0][j] = 1;
			map[7][j] = 1;
		}
		// 4.�������һ�к����ұ�һ��ȫ������Ϊ1
		for(int i = 0;i < 8;i++){
			map[i][0] = 1;
			map[i][6] = 1;
		}
		
		map[3][1] = 1;
		map[3][2] = 1;
		
		System.out.println("===============�����ǰ��ͼ=====================");
		for(int i = 0;i < map.length;i++){
			for(int j = 0;j < map[i].length;j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}	
		
		// ʹ��findway��������������·
		T t1 = new T();
		t1.findWay(map,1,1);
		System.out.println("===============����·��ĵ�ͼ=====================");
		for(int i = 0;i < map.length;i++){
			for(int j = 0;j < map[i].length;j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}	
	}
}
class T {
	//ʹ�õݹ���ݵ�˼�������������Թ�

//1. findway��������ר�����ҳ��Թ���·��
//2������ҵ�,�ͷ���true ,���򷵻�false
//3. map���Ƕ�ά���飬����ʾ�Թ�
//4. i,j���������λ�ã���ʼ����λ��Ϊ(1,1)
//5����Ϊ�����ǵݹ����·���������ȹ涨map����ĸ���ֵ�ĺ���
//	 0��ʾ������   1��ʾ�ϰ���    2��ʾ������ͨ  3��ʾ�߹��������߲�ͨ����·
//6����map[6][5] =2��˵���ҵ�ͨ·,�Ϳ��Խ���������ͼ�����.
//7����ȷ��������·������->��->��->��
//8. �ı���·���ԣ�·�߻ᷢ���仯�����ǵ���if-else if ���˳��
	public boolean findWay(int[][] map , int i, int j){
		
		if(map[6][5] == 2){//˵���Ѿ��ҵ�
			return true;
		}else{
				if(map[i][j] == 0){//��ǰ���λ��0,˵����ʾ������
					
					//���Ǽٶ�������ͨ
					map[i][j] = 2;
					
					//ʹ����·���ԣ���ȷ����λ���Ƿ���Ŀ�����ͨ
					//��->��->��-��>��
					if(findWay(map, i + 1,j)){//������
						return true;
					}else if(findWay(map, i, j + 1)){//��
						return true;
					}else if(findWay(map, i-1, j)) {//��
						return true ;
					}else if(findWay(map, i, j-1)){//��
						return true;
					}else{
						map[i][j] = 3;
						return false;
					}
				
				}else{//map[i][j]= 1��2, 3    1,3��ʾ�߲�ͨ��2��ʾ̽�����
					return false;
				}
			}
	}
}