public class Method02{
	public static void main(String[] args){
		int[][] map = {{0,0,1},{1,1,1},{1,1,3}};
		
		
		// ʹ�÷���������
		Tool tool = new Tool();
		tool.printArr(map);
		tool.printArr(map);
		
		
	/*	// ��ͳ�Ľ����ʽ
		for(int i = 0;i < map.length;i++){
			for(int j = 0;j < map[i].length;j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		
		
		// �ٴα���
		for(int i = 0;i < map.length;i++){
			for(int j = 0;j < map[i].length;j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		
		
		// �ٴα���
		for(int i = 0;i < map.length;i++){
			for(int j = 0;j < map[i].length;j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}	
		*/
	}
}

class tool{
	// ����������һ����ά����
	public void printArr(int[][] map){
		for(int i = 0;i < map.length;i++){
			for(int j = 0;j < map[i].length;j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}	
	}
}