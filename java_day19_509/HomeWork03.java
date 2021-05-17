 // 3.编写类Book，定义方法updatePrice，实现更改某本书的价格，
 //具体:如果价格>150,则更改为150，如果价格>100,更改为100，否则不变

 public class HomeWork03{
	  public static void main(String[] args){
		 
		 Book bk1 = new Book("笑傲江湖",145.8);
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
		 // 如果方法中没有price局部变量，this.price 等价price
		 if (this.price > 150){
			 this.price = 150;
		 }else if (this.price > 100){
			 this.price = 100;
		 }
	 }
	 // 显示书籍情况
	 public void info(){
		 System.out.println("书名为" + this.name + "价格为" + this.price);
	 }
 }