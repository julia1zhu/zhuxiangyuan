// 9.定义Music类，里面有音乐名name、音乐时长times属性，
// 并有播放play功能和返回本身属性信息的功能方法getlnfo.

public class HomeWork09{
	  public static void main(String[] args){
		  Music m = new Music("我要我们在一起",520);
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
		System.out.println("播放音乐");
	}
	
	public String getInfo(){
		return "音乐" + name + "时长为" + times;
	}
	
	
}