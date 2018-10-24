package interview.fundamental;

/**
 * 下面是findSum（int m.int n）方法的定义，方法调用findSum（1，5）的返回结果是( )
 * Created by liangjunjia on 2018/10/24.
 */
public class Demo2 {
    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        System.out.println(demo2.findSum(1, 5));
    }

    private int findSum(int m, int n) {
        int sum = 0;
        for (int i = m; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}