// 9.����Music�࣬������������name������ʱ��times���ԣ�
// ���в���play���ܺͷ��ر���������Ϣ�Ĺ��ܷ���getlnfo.

public class HomeWork09{
	  public static void main(String[] args){
		  Music m = new Music("��Ҫ������һ��",520);
		  m.play();
		  System.out.println(m.getInfo());
	  }
}

class Music {
	String name;
	int times;
	
	public Music(String name,int times){
		this.name = name;
		this.times = times;	
	}
	
	public void play(){
		System.out.println("��������");
	}
	
	public String getInfo(){
		return "����" + name + "ʱ��Ϊ" + times;
	}
	
	
}