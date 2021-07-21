/**
 * @author 朱香原
 * 消费者
 */
@SuppressWarnings("all")
public class Consumer implements Runnable{
    private Resource resource;
    private Resource2 resource2;

    public Consumer(Resource2 resource2) {
        this.resource2 = resource2;
    }

    public Consumer(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            resource.destroy();
        }

    }
}
