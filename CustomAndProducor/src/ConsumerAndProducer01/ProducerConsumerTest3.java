/**
 * @author 朱香原
 */
public class ProducerConsumerTest3 {
    public static void main(String args[]) {
        Resource3 resource3 = new Resource3();
        new Thread(new Producer3(resource3)).start();//生产者线程
        new Thread(new Producer3(resource3)).start();//生产者线程
        new Thread(new Consumer3(resource3)).start();//消费者线程
        new Thread(new Consumer3(resource3)).start();//消费者线程

    }
}
