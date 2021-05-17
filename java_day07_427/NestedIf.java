// 参加歌手比赛，如果初赛成绩大于8.0进入决赛，否则提示淘汰。
// 并且根据性别提示进入男子组或女子组。
// 输入成绩和性别，进行判断和输出信息。


import java.util.Scanner;
public class NestedIf{
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入该歌手的成绩");
		double score = scanner.nextDouble();
		
		if(score > 8.0){
			System.out.println("请输入该歌手的性别");
			char gender = scanner.next().charAt(0);
			if(gender == '女'){
				System.out.println("进入女子组决赛");
			}else if(gender == '男'){
				System.out.println("进入男子组决赛");
			}
		}else{
			System.out.println("淘汰");
		}
		
	}
}