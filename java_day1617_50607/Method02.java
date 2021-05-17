public class Method02{
	public static void main(String[] args){
		int[][] map = {{0,0,1},{1,1,1},{1,1,3}};
		
		
		// 使用方法完成输出
		Tool tool = new Tool();
		tool.printArr(map);
		tool.printArr(map);
		
		
	/*	// 传统的解决方式
		for(int i = 0;i < map.length;i++){
			for(int j = 0;j < map[i].length;j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		
		
		// 再次遍历
		for(int i = 0;i < map.length;i++){
			for(int j = 0;j < map[i].length;j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		
		
		// 再次遍历
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
	// 方法，接收一个二维数组
	public void printArr(int[][] map){
		for(int i = 0;i < map.length;i++){
			for(int j = 0;j < map[i].length;j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}	
	}
}