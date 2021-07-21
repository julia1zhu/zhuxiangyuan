/**
 * @author 朱香原
 * 需求情景
 *
 * 两个线程，一个负责生产，一个负责消费，生产者生产一个，消费者消费一个。
 * 涉及问题
 *
 * 同步问题：如何保证同一资源被多个线程并发访问时的完整性。常用的同步方法是采用标记或加锁机制。
 * wait() / nofity() 方法是基类Object的两个方法，也就意味着所有Java类都会拥有这两个方法，这样，我们就可以为任何对象实现同步机制。
 * wait()方法：当缓冲区已满/空时，生产者/消费者线程停止自己的执行，放弃锁，使自己处于等待状态，让其他线程执行。
 * notify()方法：当生产者/消费者向缓冲区放入/取出一个产品时，向其他等待的线程发出可执行的通知，同时放弃锁，使自己处于等待状态。
 */
public class ProducerConsumerTest {
    public static void main(String args[]) {
        Resource resource = new Resource();
        new Thread(new Producer(resource)).start();//生产者线程
        new Thread(new Consumer(resource)).start();//消费者线程

    }
}
