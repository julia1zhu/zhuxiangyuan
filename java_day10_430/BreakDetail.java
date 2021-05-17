public class BreakDetail{
	
	public static void main(String[] args){
		lable1:
		for(int j =0; j <4;j++){
			lable2:
				for(int i = 0; i < 10; i++){  //外层for
					if(i == 2){
						break lable1;
					}
				System.out.println( "i = " + i);  // 内层for
				}
		}
		System.out.println("退出for循环，执行下面的程序");
	}
}