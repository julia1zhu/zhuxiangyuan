package thread_;

/**
 * @author 朱香原
 * [售票系统]，编程模拟三个售票窗口售票100.分别使用继承 Thread和实现 Runnable方式,并分析有什么问题?
 */
public class SellTicket {
    public static void main(String[] args) {
        //使用继承Thread类
        // 会出现票超卖问题

//        //窗口1
//        SellTicket0 sellTicket0 = new SellTicket0();
//        sellTicket0.start();
//        // 窗口2
//        SellTicket0 sellTicket01 = new SellTicket0();
//        sellTicket01.start();
//        // 窗口3
//        SellTicket0 sellTicket02 = new SellTicket0();
//        sellTicket02.start();
//

        //使用实现Runnable接口方式
        SellTicket1 sellTicket1 = new SellTicket1();
        //窗口1
        Thread thread = new Thread(sellTicket1);
        thread.start();
        //窗口2
        Thread thread1 = new Thread(sellTicket1);
        thread1.start();
        // 窗口3
        Thread thread2 = new Thread(sellTicket1);
        thread2.start();
    }
}

@SuppressWarnings("all")
class SellTicket0 extends Thread {
    private static int count = 100;
    @Override
    public void run() {
        while (true){

            if(count <= 0){
                System.out.println("售票结束。。。");
                break;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("窗口" + Thread.currentThread().getName() + "卖了一张票，剩余票数：" + (--count) ) ;
        }

    }
}

@SuppressWarnings("all")
class SellTicket1 implements Runnable {
    private int count = 100;
    @Override
    public void run() {
        while (true){
           if (count <= 0){
               System.out.println("售票结束");
               break;
           }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("窗口" + Thread.currentThread().getName() + "卖了一张票，剩余票数：" + (--count) ) ;
        }
    }
}