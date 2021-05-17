public class HomeWork042{
	public static void main(String[] args){
		// 1，我们先确定添加数应该插入到哪个索引
		// 2．然后扩容

		//先定义原数组
		int[]arr = {10,12,45,21};

		int insertNum = 23;
		int index = -1; //index就是要插入的位置
		//遍历arr数组，如果发现 insertNum<=arr[i]，说明i 就是要插入的位置
		//使用index保留index = i;
		//如果遍历完后，没有发现 insertNum<=arr[i],说明index = arr.length
		//即︰添加到arr的最后
		for(int i = 0; i < arr.length;i++){
			if(insertNum <= arr[i]){
				index = i;
				break; //找到位置后，就退出
			}
		}
		//判断index的值，可以看出是否找到位置
		if(index == -1){
			index = arr.length;
		}
		
		// 扩容
		//先创建一个新的数组,大小arr.length + 1
		
		int[]arrNew = new int[arr. length + 1];
		
		//将arr的元素拷贝到arrNew ,并且要跳过index位置
		/*
		分析:
		int[]arr = {10，12，45,90};
		arrNew = {           }
		*/
		
		for(int i = 0, j = 0; i < arrNew.length; i++){
			if(i != index){  //说明可以把arr的元素拷贝到arrNew
				arrNew[i]= arr[j];
				j++;
			}else{  //这个位置就是要插入的数
				arrNew[i] = insertNum;
			}

		}
		
		// 让arr指向araNew，原来的数组，就成为垃圾，被销毁。
		arr = arrNew;
		
		System.out.println("=======================================");
		for(int i = 0;i< arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}