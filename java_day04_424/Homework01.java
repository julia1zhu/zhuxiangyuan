// 1.���ʵ�����¹���
//  ĳ����100,000Ԫ,ÿ����һ��·�ڣ���Ҫ����,��������:
    //  1)���ֽ�>50000ʱ,ÿ�ν�5%
    //  2)���ֽ�<=50000ʱ,ÿ�ν�1000
//  ��̼�����˿��Ծ������ٴ�·��,Ҫ��:ʹ��while break��ʽ���

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