package user;

/**
 * 线程的常用方法
 *
 * @author YC
 * @create 2018/3/19 20:47.
 */
public class RunnableDemo1 {

    public static void main(String[] args) throws InterruptedException {
        method1();
        method2();
        method3();
        method4();
        method5();
    }

    /**
     * 方法1: 获取当前线程对象, 获取当前线程对象的名称
     */
    private static void method1() {
        RunnableMethod runnableMethod = new RunnableMethod();
        Thread thread = new Thread(runnableMethod);
        thread.start();
    }

    /**
     * 方法2: 强制启动线程
     *
     * @author YC
     * @create 2018/3/19 23:28.
     */
    private static void method2() throws InterruptedException {
        RunnableMethod1 rm = new RunnableMethod1("A");
        Thread thread = new Thread(rm);
        thread.start();
        for (int i = 0; i < 50; i++) {
            if (i > 10) {
                // 获取强制执行 - Created by YC.
                thread.join();
            }
            System.out.println("主线程:\t" + i);
        }
    }

    /**
     * 方法3: 判断当前线程是否启动
     *
     * @author YC
     * @create 2018/3/19 23:27.
     */
    private static void method3() {
        RunnableMethod2 runnableMethod = new RunnableMethod2();
        Thread thread = new Thread(runnableMethod);
        System.out.println("判断当前线程是否启动:\t" + thread.isAlive());
        thread.start();
        System.out.println("判断当前线程是否启动:\t" + thread.isAlive());
    }

    /**
     * 方法4: 线程的礼让方法的使用
     *
     * @author YC
     * @create 2018/3/19 23:33.
     */
    private static void method4() {
        RunnableMethod3 runnableMethod1 = new RunnableMethod3("A");
        RunnableMethod3 runnableMethod2 = new RunnableMethod3("B");
        Thread thread1 = new Thread(runnableMethod1);
        Thread thread2 = new Thread(runnableMethod2);
        thread1.start();
        thread2.start();
    }

    /**
     * 方法: 线程睡眠的使用
     *
     * @author YC
     * @create 2018/3/19 23:43.
     */
    private static void method5() {
        RunnableMethod4 runnableMethod = new RunnableMethod4("A");
        Thread thread = new Thread(runnableMethod);
        thread.start();
    }
}

/**
 * 获取当前线程对象的方法
 * 获取当前线程对象名称的方法
 *
 * @author YC
 * @create 2018/3/19 21:55.
 */
class RunnableMethod implements Runnable {

    public void run() {
        System.out.println("获取当前线程对象:\t" + Thread.currentThread());
        System.out.println("获取当前线程对象的名称:\t" + Thread.currentThread().getName());
    }
}

/**
 * 强制执行的方法
 * 验证依据是主线程早于其他线程之前执行, 在执行主线程时强制执行其他线程
 *
 * @author YC
 * @create 2018/3/19 21:56.
 */
class RunnableMethod1 implements Runnable {

    private String name;

    public RunnableMethod1(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(name + ":" + i);
        }
    }
}

/**
 * 判断当前线程是否启动
 *
 * @author YC
 * @create 2018/3/19 23:34.
 */
class RunnableMethod2 implements Runnable {

    public void run() {
        System.out.println("执行了RunnableMethod2线程中的run()方法");
    }
}

/**
 * 线程礼让的使用
 * 注意: 礼让并不是一定发生的, 和线程的优先级一样, 只是执行的可能性比较高
 *
 * @author YC
 * @create 2018/3/19 23:35.
 */
class RunnableMethod3 implements Runnable {

    private String name;

    public RunnableMethod3(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(name + ":" + i);
            if (i == 10) {
                System.out.println("礼让");
                Thread.yield();
            }
        }
    }
}

/**
 * 线程的睡眠的使用
 *
 * @author YC
 * @create 2018/3/19 23:36.
 */
class RunnableMethod4 implements Runnable {

    private String name;

    public RunnableMethod4(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 50; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(name + ":" + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}