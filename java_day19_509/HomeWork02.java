 //2. 编写类A02，定义方法find，实现查找某字符串是否在字符串数组中，并返回索引,
 // 如果找不到,返回-1. 
 public class HomeWork02{
	  public static void main(String[] args){
		  String[] arr = {"李宇春","周笔畅","张靓颖"};
		  A02 a = new A02();
		  
		  if(a.find("张靓颖",arr) == -1){
			System.out.println("在字符串数组中找不到该字符串");
		  }else{
			System.out.println("在数组中的索引为" + a.find("张靓颖",arr));  
		  }
	  }
 }
 
 
 class A02 {
	 public int find(String findStr,String[] strs){
		 for(int i = 0;i < strs.length;i++){
			 if(findStr.equals(strs[i])){
				 return i;
			 }
		 }
		 return -1;
	 }
 }
 