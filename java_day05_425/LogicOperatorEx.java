public class LogicOperatorEx{
	public static void main(String[] args){
		
		int x = 5;
		int y = 5;
		if(x++==6 & ++y==6){ //�߼��� false x=6 y=6  Ҫ���������Լ�����
		x= 11;
		System.out.println("x=" + x + ",y=" + y); 
		
		
	//=========================================================================
		int x = 5,y = 5;
		if(x++==5 | ++y==5)}{ //�߼���  true  x=6 y =6 
			x=11;                   // ִ�и���� x=11 y=6
		System.out.printn("x="+ x + ",y=" + y); 

	//=========================================================================

		int x=5,y=5;
		if(x++==6 && ++y==6){ //��·��  false  x=6  y=5
			x= 11;
		System.out.println("x=" + x +",y=" + y);
		
		
	// ========================================================================
		int x = 5,y = 5;
		if(x++==5 || ++y==5){ //��·�� true  x=6 y=5
			x =11;             //ִ�и����  x=11 ��y =5
		}
		System.out.println("x=" + x + ",y="+ y); 

	}
}