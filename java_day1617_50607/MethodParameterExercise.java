// 1)编写类MyTools类,编写一个方法可以打印二维数组的数据。
// 2)编写一个方法copyPerson，可以复制一个Person对象，返回复制的对象。
//   克隆对象,注意要求得到新对象和原来的对象是两个独立的对象，只是他们的属性相同


public class MethodParameterExercise{
	public static void main(String[] args){	
		int[][] arr = {{1,2,3},{4,5,6}};
		
		MyTools mytools = new MyTools();
		mytools.printArr(arr);
		
		Person p = new Person();
		p.name = "julia";
		p.age = 21;
		Person p2 = mytools.copyPerson(p);
	
	// 到此，p和p2是Person对象，但是是两个独立的对象，属性相同
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
		// 创建一个新对象，并复制属性
		Person p2 = new Person();
		p2.name = p.name;
		p2.age = p.age;
		
		return p2;
	}
}