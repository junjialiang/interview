package interview.thread;

/**
 * 下列代码执行结果为（）
 * Created by liangjunjia on 2018/10/11.
 */
public class Test2 {
    public static void main(String args[]) throws InterruptedException {
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print("2");
        });
        t.start();
        t.join();
        System.out.print("1");
    }
}
