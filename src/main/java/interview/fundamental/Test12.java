package interview.fundamental;

/**
 * 执行如下代码后输出结果为（ ）
 * Created by liangjunjia on 2018/10/21.
 */
public class Test12 {
    public static void main(String[] args) {
        System.out.println("return value of getValue(): " + getValue());
    }

    private static int getValue() {
        int i = 1;
        try {
            i = 4;
        } finally {
            i++;
            return i;
        }
    }
}
