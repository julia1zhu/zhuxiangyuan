// 1.���ʵ�����¹���
//  ĳ����100,000Ԫ,ÿ����һ��·�ڣ���Ҫ����,��������:
    //  1)���ֽ�>50000ʱ,ÿ�ν�5%
    //  2)���ֽ�<=50000ʱ,ÿ�ν�1000
//  ��̼�����˿��Ծ������ٴ�·��,Ҫ��:ʹ��while break��ʽ���


// ���󣬲�Ӧ���ǡ�=0 break��Ӧ����С��1000��Ҫbreak
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
		System.out.println("���˿��Ծ���" + count + "��·��");
    }
}