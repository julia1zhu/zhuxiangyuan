public class LogicOperatorEx{
	public static void main(String[] args){
		
		int x = 5;
		int y = 5;
		if(x++==6 & ++y==6){ //逻辑与 false x=6 y=6  要考虑自增自减符号
		x= 11;
		System.out.println("x=" + x + ",y=" + y); 
		
		
	//=========================================================================
		int x = 5,y = 5;
		if(x++==5 | ++y==5)}{ //逻辑非  true  x=6 y =6 
			x=11;                   // 执行该语句 x=11 y=6
		System.out.printn("x="+ x + ",y=" + y); 

	//=========================================================================

		int x=5,y=5;
		if(x++==6 && ++y==6){ //短路与  false  x=6  y=5
			x= 11;
		System.out.println("x=" + x +",y=" + y);
		
		
	// ========================================================================
		int x = 5,y = 5;
		if(x++==5 || ++y==5){ //短路非 true  x=6 y=5
			x =11;             //执行该语句  x=11 ，y =5
		}
		System.out.println("x=" + x + ",y="+ y); 

	}
}