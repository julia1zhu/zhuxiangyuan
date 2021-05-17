// 1.编程实现如下功能
//  某人有100,000元,每经过一次路口，需要交费,规则如下:
    //  1)当现金>50000时,每次交5%
    //  2)当现金<=50000时,每次交1000
//  编程计算该人可以经过多少次路口,要求:使用while break方式完成

public class Homework01{
	public static void main(String[] args){
		int count;
		while(int cash = 100000;cash > 50000;cash*=0.95){
			count++;
		}
		while(cash;cash <= 50000;cash -=1000){
			count++;
			if(cash <= 0){
				break;
			}
		}
    }
}