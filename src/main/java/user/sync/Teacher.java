package user.sync;

public class Teacher implements Runnable {

    private Print print;
    private String name;
    private int eScore, mScore, yScore;

    public Teacher(Print print, String name, int eScore, int mScore, int yScore) {
        this.print = print;
        this.name = name;
        this.eScore = eScore;
        this.mScore = mScore;
        this.yScore = yScore;
    }

    public Print getPrint() {
        return print;
    }

    public void setPrint(Print print) {
        this.print = print;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int geteScore() {
        return eScore;
    }

    public void seteScore(int eScore) {
        this.eScore = eScore;
    }

    public int getmScore() {
        return mScore;
    }

    public void setmScore(int mScore) {
        this.mScore = mScore;
    }

    public int getyScore() {
        return yScore;
    }

    public void setyScore(int yScore) {
        this.yScore = yScore;
    }

    /**
     * 通过synchronized(资源对象){代码块}加锁来实现线程的同步功能
     *
     * @author YC
     * @create 2018/3/20 20:02.
     */
    public void run() {
        synchronized (print) {
            try {
                print.printScore(name, eScore, mScore, yScore);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
