public class YangHui{
	// 打印一个10行的杨辉三角
	/*
	1
	1 1
	1 2 1
	1 3 3 1
	1 4 6 4 1
	1 5 10 10 5 1
	....
	*/
	public static void main(String[] args){
		int[][] yangHui = new int[10][];
		for(int i = 0;i < yangHui.length;i++){
			
			yangHui[i] = new int[i + 1];
			for(int j = 0;j < yangHui[i].length;j++){
				if(j == 0||j == yangHui[i].length-1){
					yangHui[i][j] = 1;
				}else{
					yangHui[i][j] = yangHui[i-1][j] + yangHui[i-1][j-1];
				}
			}
		}
		
		for(int i = 0;i < yangHui.length;i++){
			for(int j = 0;j < yangHui[i].length;j++){
				System.out.print(yangHui[i][j] + "  ");
			}
			System.out.println();
		}
	}
}