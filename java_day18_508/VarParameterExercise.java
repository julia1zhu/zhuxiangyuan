//�������������ֱ�ʵ�� 1)�������������ſγɼ�(�ܷ�)��
//2)�������������ſγɼ�(�ܷ�),3)�������������ſγɼ�(�ܷ�)��
//��װ��һ���ɱ�����ķ���   ����Method������showScore



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
		return name + scores.length +"�ſεĳɼ��ܷ�=" + sum;
	}
}