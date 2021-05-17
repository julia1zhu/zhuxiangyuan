// 1.编程实现如下功能
//  某人有100,000元,每经过一次路口，需要交费,规则如下:
    //  1)当现金>50000时,每次交5%
    //  2)当现金<=50000时,每次交1000
//  编程计算该人可以经过多少次路口,要求:使用while break方式完成


// 错误，不应该是《=0 break，应该是小于1000就要break
public class Homework01{
	public static void main(String[] args){
		int count = 0;
		int cash = 100000;
		
		while(cash > 50000){ 
			count++;
			cash *= 0.95;
		}
		while(cash <= 50000){
			count++;
			cash -= 1000;
			if(cash < 1000){
				break;
			}
		}
		System.out.println("该人可以经过" + count + "次路口");
    }
}