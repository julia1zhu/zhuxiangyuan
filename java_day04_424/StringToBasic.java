public class StringToBasic{
	public static void main(String[] args){
		//基本数据类型->String
		int n1 = 100;
		float f1 = 1.1F;
		double d1 = 4.5;
		boolean b1 = true;
		String s1 = n1 + "";
		String s2 = f1 + "";
		String s3 = d1 + "";
		String s4 = b1 + "";
		System.out.println(s1+ "" + s2 + "" + s3 + "" + s4);
		
		//String->对应的基本数据类型
		String s5 = "123";
		int num1 = Integer.parseInt(s5);
		short num2 = Short.parseShort(s5);
		long num3 = Long.parseLong(s5);
		byte num4 = Byte.parseByte(s5);
		//  char num5 = Char.parseChar(s5);   不是这么转换的
		float num6 = Float.parseFloat(s5);
		double num7 = Double.parseDouble(s5);
		boolean num8 = Boolean.parseBoolean("true");
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num2);
		System.out.println(num4);
		//   System.out.println(num5); 
		System.out.println(num6);
		System.out.println(num7);
		System.out.println(num8);
		System.out.println(s5.charAt(0));
	}
}


