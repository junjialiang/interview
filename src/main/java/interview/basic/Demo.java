package interview.basic;

/**
 * 以下代码执行的结果显示是多少（）？
 * Created by liangjunjia on 2018/10/10.
 */
public class Demo {
    public static void main(String[] args) {
        System.out.print(getNumber(0));
        System.out.print(getNumber(1));
        System.out.print(getNumber(2));
        System.out.print(getNumber(4));
    }

    private static int getNumber(int num) {
        try {
            return 2 / num;
        } catch (Exception exception) {
            return 0;
        } finally {
            if (num == 0) {
                return -1;
            }
            if (num == 1) {
                return 1;
            }
        }
    }
}
