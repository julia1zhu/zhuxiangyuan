import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 3};
        new Scanner(System.in);

        // 开始快捷键，自动分配变量名
        Scanner scanner = new Scanner(System.in);
        Scanner sanner2 = new Scanner(System.in);
        MyTools myTools = new MyTools();
        myTools.bubble(arr);
        // 因为引用数据类型传参时是传递地址，因此直接打印就可以
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// 创建一个类，编写一个方法，可以完成对int数组冒泡排序的功能
class MyTools {
    public void bubble(int[] arr) {
        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
class Person{
    String name;
    int age;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}



