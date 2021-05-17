public class LogicOperatorEx2{
	public static void main(String[] args){
		boolean x = true;
		boolean y = false;
		short z =46;
		if((z++==46)&&(y=true)){  // true z=47
			z++;  //z=48
		}
		if((x=false)|| (++z==49)){ // true z=49
			z++;  // z=50
		}
		System.out.println("z=" + z);
	}
}
