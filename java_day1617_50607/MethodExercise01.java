public class MethodExercise01{
	public static void main(String[] args){	
// 1.编写类AA 有一个方法:判断一个数是奇数odd还是偶数，返回boolean
// 2.根据行、列、字符打印对应行数和列数的字符，比如:行: 4,列: 4,字符#,则打印相应的效果
	 AA a = new AA();
	 boolean isOdd = a.oddIf(5);
	 if(isOdd){
		 System.out.println("是奇数");
	 }else{
		 System.out.println("是偶数");
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
	
	
	//根据行、列、字符打印对应行数和列数的字符,
	//比如︰行:4，列:4，字符#,则打印相应的效果/*
	/*####
	  ####
	  ####
	  ####
	  */
	
	//思路
	//1．方法的返回类型void
	//2．方法的名字print
	//3．方法的形参(int row,int col,char c)
	//4．方法体：循环
	
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
	
	
	或者return num%2 != ;0 ? true:false;
	
	或者return num%2 != 0;
	
	
	
*/