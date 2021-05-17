public class SwitchDetail{
	public static void main(String[] args){
		char c = 'a';
		switch(c){
			case 20:  // char类型可以和int型转换
				System.out.println("ok1");
				break;
			case 'b':
				System.out.println("ok2");
				break;
			default :
				System.out.println("ok13");
	}
}