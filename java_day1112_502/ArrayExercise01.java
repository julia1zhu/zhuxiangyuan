public class ArrayExercise01{
	public static void main(String[] args){
		//  创建一个char类型的26个元素的数组，分别放置'A'-Z‘。
		//  使用for循环访问所有元素并打印出来。
		//  提示:char类型数据运算'A‘+1 ->‘B'
		char a[] = new char[26];
		char c = 'A';
		for(int i = 0;i<a.length;i++){
			a[i] = c;   // (int)'A' + i
			c++;
			System.out.println("第" + (i+1) + "个元素是" + a[i]);
		}			
	}
}