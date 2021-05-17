//有三个方法，分别实现 1)返回姓名和两门课成绩(总分)。
//2)返回姓名和三门课成绩(总分),3)返回姓名和五门课成绩(总分)。
//封装成一个可变参数的方法   类名Method方法名showScore



public class VarParameterExercise{
	public static void main(String[] args){
		Method m = new Method();
		System.out.println(m.showScore("julia",74.8,90,87.5,99,100));
		System.out.println(m.showScore("jung yong hwa",90,87.5,99,100));
	}
}

class Method {
	public String showScore(String name,double... scores){
		double sum = 0;
		for(int i = 0;i < scores.length;i++){
			sum += scores[i];
		}
		return name + scores.length +"门课的成绩总分=" + sum;
	}
}