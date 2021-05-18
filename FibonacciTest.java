public class FibonacciTest {
// 请使用递归的方式求出斐波那契数1,1,2,3,5,8,13..
//    给n，输出它的斐波那契数列
        public static void main(String[] args){
            Fibonacci fi = new Fibonacci();
            // 当n为1或者2时，count可以为任意数，当n>2时，count的值需要比n大1
            fi.fibonacci(5,6);
        }
    }

class Fibonacci {
        int i = 1;

        public Integer fibonacci(int n,int count){
            if(n == 1 && i == 1){
                System.out.println(1);
                return null;
            }else if(n == 2 && i == 1){
                System.out.println(1 + " " + 1);
                return null;
            }else {
                if (n == 1 || n == 2) {
                    return 1;
                } else {
                    if (i == 1) {
                        System.out.print(1 + " ");
                        System.out.print(1 + " ");
                    }
                    i = 2;
                    // 如果是输入5，控制只让fi（4），也就是较大的那个数字，在迭代过程中的数字输出
                    if (n == count - 1 && i == 2) {
                        System.out.print((fibonacci(n - 1, count - 1) + fibonacci(n - 2, count)) + " ");
                        i = 3;
                    }
                    return fibonacci(n - 1, count) + fibonacci(n - 2, count);
                }
            }
        }
}

