public class Method01{
	public static void main(String[] args){
		/* 1)���speak��Ա����,�������һ������
		   2)���cal01��Ա����,���Լ����1+..+1000�Ľ��
           3)���cal02��Ա����,�÷������Խ���һ����n�������1+.+n�Ľ��
		   4)���getSum��Ա����,���Լ����������ĺ�
		*/
		// ����ʹ��
		// 1. ����д�ú������ȥ���ã��Ͳ������
		// 2. �ȴ�������Ȼ����÷�������
		Person p1 = new Person();
		p1.speak();  // ���÷���
		p1.cal01();  // ����cal01����
		p1.cal02(5);  // ����cal02������ͬʱ��n =5
		int returnRes = p1.getSum(10,20);  
		System.out.println("getSum�������ص�ֵΪ" + returnRes);
		
	}
}

class Person{
	
		String name;
		int age;
		//  ��������Ա������
		// 1)���speak��Ա����,�������һ������
		// 1. public��ʾ�����ǹ���
		// 2. void :��ʾ����û�з���ֵ
		// 3. speak() : speak�Ƿ�������()�β��б�
		// 4��0������,����д����Ҫִ�еĴ���
		// 5. System.out.println("����һ������");��ʾ���ǵķ����������һ�仰
		public void speak(){
			System.out.println("����һ������");
		}
		
		//2)���cal01��Ա����,���Լ����1+..+1000�Ľ��
		public void cal01(){
			int sum = 0;
			for(int i = 1;i <= 1000;i++){
				sum += i;
			}
			System.out.println("cal01������=" + sum);
		}
		// 3)���cal02��Ա����,�÷������Խ���һ����n�������1+.+n�Ľ��
		// 1.(int n)�β��б�,��ʾ��ǰ��һ���β�n�����Խ����û�����
		public void cal02(int n){
			int sum = 0;
			for(int i = 1;i <= n;i++){
				sum += i;
			}
			System.out.println("cal02������=" + sum);
		}
	
		// 4)���getSum��Ա����,���Լ����������ĺ�
		//1. public��ʾ�����ǹ�����
		//2.int :��ʾ����ִ�к�,����һ��intֵ
		//3. getsum������
		//4.(int num1, int num2���β��б�2���βΣ����Խ����û������������
		//5. return res;��ʾ��res��ֵ,����

		public int getSum(int num1,int num2){
			int res = num1 + num2;
			return res;
		}
	
	
	
	
	
	
}