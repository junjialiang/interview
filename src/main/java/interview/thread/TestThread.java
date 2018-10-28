package interview.thread;

/**
 * 以下程序的运行结果是？
 * Created by liangjunjia on 2018/10/28.
 */
public class TestThread {
    public static void main(String args[]) {
        Runnable runnable = () -> System.out.print("foo");
        Thread t = new Thread(runnable);
        t.run();
        System.out.print("bar");
    }
}