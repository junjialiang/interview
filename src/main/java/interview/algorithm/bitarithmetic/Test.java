package interview.algorithm.bitarithmetic;

/**
 * @Author: Junjia
 * @Date: 2019-03-30 17:40
 * @Description: 如何判断一个数是否为2的 n 次方
 */
public class Test {
    public static boolean isPower(int n) {
        if (n < 1) {
            return false;
        }
        int i = 1;
        while (i <= n) {
            if (i == n) {
                return true;
            }
            i <<= 1;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPower(4));
        System.out.println(isPower(6));
    }
}
