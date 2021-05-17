public class MiGong{
	public static void main(String[] args){
	//思路
	//1．先创建迷宫，用二维数组表示 int[][] map = new int[8][7];
	//2．先规定 map数组的元素值:0表示可以走;1表示障碍物

		int[][] map = new int[8][7];
		// 3.将最上面一行和最下面一行全部设置为1
		for(int j = 0;j < 7;j++){
			map[0][j] = 1;
			map[7][j] = 1;
		}
		// 4.将最左边一列和最右边一列全部设置为1
		for(int i = 0;i < 8;i++){
			map[i][0] = 1;
			map[i][6] = 1;
		}
		
		map[3][1] = 1;
		map[3][2] = 1;
		
		System.out.println("===============输出当前地图=====================");
		for(int i = 0;i < map.length;i++){
			for(int j = 0;j < map[i].length;j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}	
		
		// 使用findway方法来给老鼠找路
		T t1 = new T();
		t1.findWay(map,1,1);
		System.out.println("===============找完路后的地图=====================");
		for(int i = 0;i < map.length;i++){
			for(int j = 0;j < map[i].length;j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}	
	}
}
class T {
	//使用递归回溯的思想来解决老鼠出迷宫

//1. findway方法就是专内来找出迷宫的路径
//2．如果找到,就返回true ,否则返回false
//3. map就是二维数组，即表示迷宫
//4. i,j就是老鼠的位置，初始化的位置为(1,1)
//5．因为我们是递归的找路，所以我先规定map数组的各个值的含义
//	 0表示可以走   1表示障碍物    2表示可以走通  3表示走过，但是走不通是死路
//6．当map[6][5] =2就说明找到通路,就可以结束，否则就继续找.
//7．先确定老鼠找路策略下->右->上->方
//8. 改变找路策略，路线会发生变化，就是调整if-else if 语句顺序
	public boolean findWay(int[][] map , int i, int j){
		
		if(map[6][5] == 2){//说明已经找到
			return true;
		}else{
				if(map[i][j] == 0){//当前这个位置0,说明表示可以走
					
					//我们假定可以走通
					map[i][j] = 2;
					
					//使用找路策略，来确定该位置是否真的可以走通
					//下->右->上-→>左
					if(findWay(map, i + 1,j)){//先走下
						return true;
					}else if(findWay(map, i, j + 1)){//右
						return true;
					}else if(findWay(map, i-1, j)) {//上
						return true ;
					}else if(findWay(map, i, j-1)){//左
						return true;
					}else{
						map[i][j] = 3;
						return false;
					}
				
				}else{//map[i][j]= 1，2, 3    1,3表示走不通，2表示探测过了
					return false;
				}
			}
	}
}