package interview.fundamental;

/**
 * 下列代码的执行结果是（）
 * Created by liangjunjia on 2018/10/14.
 */
public class Test2 {
    private static int a = 1;

    public static void main(String[] args) {
        int a = 10;
        a++;
        Test2.a++;
        Test2 t = new Test2();
        System.out.println("a=" + a + " t.a=" + t.a);
    }
}