 //2. ��д��A02�����巽��find��ʵ�ֲ���ĳ�ַ����Ƿ����ַ��������У�����������,
 // ����Ҳ���,����-1. 
 public class HomeWork02{
	  public static void main(String[] args){
		  String[] arr = {"���","�ܱʳ�","����ӱ"};
		  A02 a = new A02();
		  
		  if(a.find("����ӱ",arr) == -1){
			System.out.println("���ַ����������Ҳ������ַ���");
		  }else{
			System.out.println("�������е�����Ϊ" + a.find("����ӱ",arr));  
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
 