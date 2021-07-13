/**
 * @author 朱香原
 * (1)有2个用户分别从同一个卡上取钱(总额:10000)
 * (2)每次都取1000,当余额不足时，就不能取款了
 * (3)不能出现超取现象=》线程同步问题.
 */
public class Homework02 {
    public static void main(String[] args) {
        Acount a = new Acount();
        Thread A = new Thread(a);
        Thread B = new Thread(a);

        A.start();
        B.start();
    }
}


@SuppressWarnings("all")
class Acount implements Runnable {
    private int account = 10000;//卡上总共有10000块

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (account <= 0) {
                    System.out.println("余额不足。。。,不能再继续取款");
                    break;
                }

                account = account - 100;
                System.out.println(Thread.currentThread().getName() + "从账户取走1000，还剩" + account);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}