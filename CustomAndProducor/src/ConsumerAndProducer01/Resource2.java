/**
 * @author 朱香原
 * 资源
 */
public class Resource2 {
    /*资源序号*/
    private int number = 0;
    /*资源标记*/
    private boolean flag = false;

    /**
     * 生产资源
     */
    public synchronized void create() {
        /**
         * 通过以上打印结果发现问题
         * 147生产了一次，消费了两次。
         * 169生产了，而没有消费。
         *
         * 原因分析：
         * 当两个线程同时操作生产者生产或者消费者消费时，如果有生产者或消费者的两个线程都wait()时，再次notify()，
         * 由于其中一个线程已经改变了标记而另外一个线程再次往下直接执行的时候没有判断标记而导致的。
         * if判断标记，只有一次，会导致不该运行的线程运行了。出现了数据错误的情况。
         *
         * 解决方法：while判断标记，解决了线程获取执行权后，是否要运行！也就是每次wait()后再notify()时先再次判断标记。
         */
        while (flag) {//先判断标记是否已经生产了，如果已经生产，等待消费；
            try {
                wait();//让生产线程等待
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        number++;//生产一个
        System.out.println(Thread.currentThread().getName() + "生产者------------" + number);
        flag = true;//将资源标记为已经生产

        /**
         * notify：只能唤醒一个线程，如果本方唤醒了本方，没有意义。而且while判断标记+notify会导致”死锁”。
         * notifyAll解决了本方线程一定会唤醒对方线程的问题。
         */
        notifyAll();//唤醒在等待操作资源的线程（队列）
    }

    /**
     * 消费资源
     */
    public synchronized void destroy() {
        while (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName() + "消费者****" + number);

        flag = false;
        notifyAll();
    }
}
