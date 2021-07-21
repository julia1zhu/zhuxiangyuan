/**
 * @author 朱香原
 * 生产者
 */
public class Producer3 implements Runnable{

    private Resource3 resource3;

    public Producer3(Resource3 resource) {
        this.resource3 = resource3;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
                resource3.create();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
