/**
 * @author 朱香原
 * 消费者
 */
public class Consumer3 implements Runnable{
    private Resource3 resource3;

    public Consumer3(Resource3 resource3) {
        this.resource3 = resource3;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
                resource3.destroy();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

