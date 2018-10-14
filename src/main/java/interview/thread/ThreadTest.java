package interview.thread;

/**
 * 执行如下程序，输出结果是（ ）
 * Created by liangjunjia on 2018/10/13.
 */
class Test {
    private int data;
    private int result = 0;

    void m() {
        result += 2;
        data += 2;
        System.out.print(result + "  " + data);
    }
}

class ThreadExample extends Thread {
    private Test mv;

    ThreadExample(Test mv) {
        this.mv = mv;
    }

    public void run() {
        synchronized (mv) {
            mv.m();
        }
    }
}

public class ThreadTest {
    public static void main(String args[]) {
        Test mv = new Test();
        Thread t1 = new ThreadExample(mv);
        Thread t2 = new ThreadExample(mv);
        Thread t3 = new ThreadExample(mv);
        t1.start();
        t2.start();
        t3.start();
    }
}