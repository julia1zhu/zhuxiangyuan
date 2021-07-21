/**
 * @author 朱香原
 * 需求情景
 *
 * 四个线程，两个个负责生产，两个个负责消费，生产者生产一个，消费者消费一个。
 * 涉及问题
 * notifyAll()方法：当生产者/消费者向缓冲区放入/取出一个产品时，向其他等待的所有线程发出可执行的通知，
 * 同时放弃锁，使自己处于等待状态。
 */
public class ProducerConsumerTest02 {
    public static void main(String args[]) {
        Resource2 resource2 = new Resource2();
        new Thread(new Producer(resource2)).start();//生产者线程
        new Thread(new Producer(resource2)).start();//生产者线程
        new Thread(new Consumer(resource2)).start();//消费者线程
        new Thread(new Consumer(resource2)).start();//消费者线程
    }
}
