package interview.algorithm.bitarithmetic;

/**
 * @Author: Junjia
 * @Date: 2019-03-30 17:31
 * @Description: 如何用移位操作实现乘法运算
 */
public class Muti {
    public static int powerN(int m, int n) {
        for (int i = 0; i < n; i++) {
            m = m << 1;
        }
        return m;
    }

    public static void main(String[] args) {
        System.out.println("3乘以8=" + powerN(3, 3));
        System.out.println("3乘以16=" + powerN(3, 4));
    }
}
