public class FibonacciTest {
// ��ʹ�õݹ�ķ�ʽ���쳲�������1,1,2,3,5,8,13..
//    ��n���������쳲���������
        public static void main(String[] args){
            Fibonacci fi = new Fibonacci();
            // ��nΪ1����2ʱ��count����Ϊ����������n>2ʱ��count��ֵ��Ҫ��n��1
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
                    // ���������5������ֻ��fi��4����Ҳ���ǽϴ���Ǹ����֣��ڵ��������е��������
                    if (n == count - 1 && i == 2) {
                        System.out.print((fibonacci(n - 1, count - 1) + fibonacci(n - 2, count)) + " ");
                        i = 3;
                    }
                    return fibonacci(n - 1, count) + fibonacci(n - 2, count);
                }
            }
        }
}

