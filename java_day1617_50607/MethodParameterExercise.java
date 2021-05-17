// 1)��д��MyTools��,��дһ���������Դ�ӡ��ά��������ݡ�
// 2)��дһ������copyPerson�����Ը���һ��Person���󣬷��ظ��ƵĶ���
//   ��¡����,ע��Ҫ��õ��¶����ԭ���Ķ��������������Ķ���ֻ�����ǵ�������ͬ


public class MethodParameterExercise{
	public static void main(String[] args){	
		int[][] arr = {{1,2,3},{4,5,6}};
		
		MyTools mytools = new MyTools();
		mytools.printArr(arr);
		
		Person p = new Person();
		p.name = "julia";
		p.age = 21;
		Person p2 = mytools.copyPerson(p);
	
	// ���ˣ�p��p2��Person���󣬵��������������Ķ���������ͬ
		System.out.println(p==p2);  // false
	
	}
}

class Person{
	String name;
	int age;
}
class MyTools {
	public void printArr(int[][] arr){
		for(int i = 0;i < arr.length;i++){
			for(int j = 0;j <arr[i].length;j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public Person copyPerson(Person p){
		// ����һ���¶��󣬲���������
		Person p2 = new Person();
		p2.name = p.name;
		p2.age = p.age;
		
		return p2;
	}
}