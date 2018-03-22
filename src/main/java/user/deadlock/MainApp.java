package user.deadlock;

public class MainApp {

    public static void main(String[] args) {
        Resource resource1 = new Resource("资源1");
        Resource resource2 = new Resource("资源2");
        Resource resource3 = new Resource("资源3");

        MyThread myThread1 = new MyThread(resource1, resource2, "线程1");
        MyThread myThread2 = new MyThread(resource2, resource3, "线程2");
        MyThread myThread3 = new MyThread(resource3, resource1, "线程3");

        myThread1.start();
        myThread2.start();
        myThread3.start();
    }
}
