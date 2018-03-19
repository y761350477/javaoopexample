package user;

/**
 * 线程的实现两种方式
 * 1. 通过继承Thread类
 * 2. 通过实现Runnable接口
 *
 * @author YC
 * @create 2018/3/19 20:00.
 */
public class RunnableDemo {

    public static void main(String[] args) {
        /**
         * 通过继承Thread类效果
         */
        Runnable1 rb1 = new Runnable1("A");
        Runnable1 rb2 = new Runnable1("B");

        /**
         * 思考: 为什么使用run()方法，没有实现并发效果
         * 结论: 线程的启动并不是通过run()方法来启动，而是通过start()方法
         */
        /*rb1.run();
        rb2.run();*/
        rb1.start();
        rb2.start();

        /**
         * 通过实现Runnable接口方式
         */
        Runnable2 runnable1 = new Runnable2("A");
        Runnable2 runnable2 = new Runnable2("B");
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();

    }
}

/**
 * 通过继承Thread类的方式
 *
 * @author YC
 * @create 2018/3/19 20:27.
 */
class Runnable1 extends Thread {

    private String name;

    public Runnable1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(name + ":" + i);
        }
        super.run();
    }
}

/**
 * 通过实现Runnable接口
 *
 * @author YC
 * @create 2018/3/19 20:27.
 */
class Runnable2 implements Runnable {

    private String name;

    public Runnable2(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(name + ":" + i);
        }
    }
}
