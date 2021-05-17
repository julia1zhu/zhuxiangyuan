//  8.求出1-1/2+1/3-1/4.....1/100的和

//  其中一个隐藏条件，要把公式分子1写成1.0，才能得到精确的值
public class Homework08{
	public static void main(String[] args){
		double sum =0;
		for(int n = 1;n<=100;n++){
			if(n%2==0){
				sum -= 1.0/n;
			}else{
				sum += 1.0/n;
			}
		}
		System.out.println(sum);
	}
}