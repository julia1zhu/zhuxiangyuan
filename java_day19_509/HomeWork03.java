 // 3.��д��Book�����巽��updatePrice��ʵ�ָ���ĳ����ļ۸�
 //����:����۸�>150,�����Ϊ150������۸�>100,����Ϊ100�����򲻱�

 public class HomeWork03{
	  public static void main(String[] args){
		 
		 Book bk1 = new Book("Ц������",145.8);
		 bk1.info();
		 bk1.updatePrice();
		 bk1.info();
		  
	  }
 }
 
 class Book {
	 String name;
	 double price;
	 
	 public Book(String name,double price){
		 this.name = name;
		 this.price = price;
	 }
	 
	 public void updatePrice(){
		 // ���������û��price�ֲ�������this.price �ȼ�price
		 if (this.price > 150){
			 this.price = 150;
		 }else if (this.price > 100){
			 this.price = 100;
		 }
	 }
	 // ��ʾ�鼮���
	 public void info(){
		 System.out.println("����Ϊ" + this.name + "�۸�Ϊ" + this.price);
	 }
 }