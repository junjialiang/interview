package interview.fundamental;

/**
 * 以下代码执行后输出结果为（ ）
 * Created by liangjunjia on 2018/10/19.
 */
public class Test10 {
    public static void main(String[] args) {
        System.out.println("return value of getValue(): " + getValue());
    }

    private static int getValue() {
        try {
            return 0;
        } finally {
            return 1;
        }
    }
}
