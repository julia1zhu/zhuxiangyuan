public class Homework04{
	
	public static void main(String[] args){
	//试写出将String转换成double类型的语句,以及将char类型转换成String的语句
	//举例说明即可I
		String name = "34.6";
		double d = Double.parseDouble(name);
		System.out.println(d);
		
		char gender = '女';
		String str = gender + "";
		System.out.println(str);
	}
}