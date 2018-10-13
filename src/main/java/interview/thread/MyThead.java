package interview.thread;

/**
 * 有以下程序段， 则下面正确的选项是（）
 * Created by liangjunjia on 2018/10/13.
 */
public class MyThead extends Thread {
    public static void main(String[] args) {
        MyThead t = new MyThead();
        MyThead s = new MyThead();
        t.start();
        System.out.println("one.");
        s.start();
        System.out.println("two.");
    }

    public void run() {
        System.out.println("Thread");
    }
}
