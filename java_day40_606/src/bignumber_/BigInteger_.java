package bignumber_;

/**
 * @author 朱香原
 */
public class BigInteger {
    public static void main(String[] args) {

        // 当我们编程中，需要处理很大的整数，long不够用
        // 可以使用BigInteger的类来搞定
//        long l = 23432903819429;
//        System.out.println("l=" + l);

        BigInteger bigInteger = new BigInteger("2318200733437");
        BigInteger bigInteger1 = new BigInteger(100);
        System.out.println(bigInteger);
    }
}
