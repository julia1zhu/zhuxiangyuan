//1.��д��A01�����巽��max��ʵ����ĳ��double��������ֵ��������
  public class HomeWork01{
	  public static void main(String[] args){
		  double[] arr = {1.0,5.7,9.4};
		 //  1. double[] arr = {};
		 //  2. double[] arr = null;
		 
		  A01 a = new A01();
		  Double res = a.max(arr);
		  if(res != null){
			  System.out.println("�����е����ֵΪ " + a.max(arr));
		  }else{
			  System.out.println("arr�������������鲻��Ϊnull������{}");
		  }
	  }
  }

// ���������ҵ���ٿ��Ǵ���Ľ�׳�� ������������û��Ԫ��
 class A01 {
	 public Double max (double[] arr){   // ����ֵ�ǰ�װ�࣬��Ե�һ�����
		if(arr != null && arr.length > 0){ // ����ڵڶ������
			double max = arr[0];
			 for (int i = 1;i < arr.length;i++){
				 if(arr[i] > max){
					 max = arr[i];
				 }
			 }
			 return max;  //double
		}else{
			return null;
		}
	 }
 }
 