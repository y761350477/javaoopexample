package user.deadlock;

public class MyThread extends Thread {

    Resource resource1;
    Resource resource2;

    public MyThread(Resource resource1, Resource resource2, String name) {
        super(name);
        this.resource1 = resource1;
        this.resource2 = resource2;
    }

    @Override
    public void run() {
        synchronized (resource1) {
            System.out.println(this.getName() + "获得了" + resource1.resourceName);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.getName() + "在等待" + resource2.resourceName);
            synchronized (resource2) {
                System.out.println(this.getName()+"获得了"+resource2.resourceName);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
