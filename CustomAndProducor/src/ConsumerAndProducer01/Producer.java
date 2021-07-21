/**
 * @author 朱香原
 * 生产者
 */
public class Producer implements Runnable {
    private Resource resource;
    private Resource2 resource2;

    public Producer(Resource2 resource2) {
        this.resource2 = resource2;
    }

    public Producer(Resource resource) {
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
            resource.create();
        }

    }
}
