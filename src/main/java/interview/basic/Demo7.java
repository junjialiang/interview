package interview.basic;

/**
 * cnt的值是
 * Created by liangjunjia on 2018/10/31.
 */
public class Demo7 {
    private static int cnt = 6;

    static {
        cnt += 9;
    }

    public static void main(String[] args) {
        System.out.println("cnt =" + cnt);
    }

    static {
        cnt /= 3;
    }
}
