import java.util.Scanner;
public class SeqSearch{
	public static void main(String[] args){
	// 1. 有一个数列:白眉鹰王、金毛狮王、紫衫龙王、青翼蝠王猜数游戏:
	// 从键盘中任意输入一个名称，判断数列中是否包含此名称【顺序查找】
    // 要求:如果找到了，就提示找到，并给出下标值。
	
	
	// 某个编程思想
		int index = -1;
	    String[] names ={"白眉鹰王","金毛狮王","紫衫龙王","青翼蝠王"};
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入名字");
		String name = scanner.next();
		
		for(int i = 0;i < names.length;i++){
			if(name.equals(names[i])){
				System.out.println("找到了" + name);
				System.out.println("下标为" + i);
				index = i;
				break;
			}
		}
		
		if(index == -1){
			System.out.println("该数列中不包含此名称");
		}
	
	}

}