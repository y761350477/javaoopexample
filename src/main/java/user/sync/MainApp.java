package user.sync;

public class MainApp {

    public static void main(String[] args) {
        Print print = new Print();
        Teacher teacher1 = new Teacher(print, "博尔特", 10, 11, 12);
        Teacher teacher2 = new Teacher(print, "加特林", 23, 56, 1);
        Teacher teacher3 = new Teacher(print, "刘翔", 34, 55, 90);

        Thread thread1 = new Thread(teacher1);
        Thread thread2 = new Thread(teacher2);
        Thread thread3 = new Thread(teacher3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
