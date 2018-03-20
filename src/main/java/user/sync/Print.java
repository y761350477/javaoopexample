package user.sync;

public class Print {

    private String name;
    private int eScore, mScore, yScore;

    // synchronized方法加锁实现线程的同步功能 - Created by YC.
    public void printScore(String name, int eScore, int mScore, int yScore) throws InterruptedException {
        System.out.println(name + "的英语成绩:\t" + eScore);
        Thread.sleep(2000);
        System.out.println(name + "的数学成绩:\t" + mScore);
        System.out.println(name + "的语文成绩:\t" + yScore);
    }
}
