package interview.basic;

/**
 * 下列程序段的输出结果是：（ ）
 * Created by liangjunjia on 2018/11/1.
 */
public class Demo8 {
    public static void main(String[] args) {
        new Demo8().complicatedexpression_r();
    }

    private void complicatedexpression_r() {
        int x = 20, y = 30;
        boolean b;
        b = x > 50 && y > 60 || x > 50 && y < -60 || x < -50 && y > 60 || x < -50 && y < -60;
        System.out.println(b);
    }
}
