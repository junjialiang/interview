package interview.algorithm.bitarithmetic;

/**
 * @Author: Junjia
 * @Date: 2019-03-30 17:59
 * @Description: 如何求二进制数中1的个数
 */
public class Test2 {
    public static int countOne(int n) {
        int count = 0; // 用来计数
        while (n > 0) {
            if ((n & 1) == 1) { // 判断最后一位是否为1
                count++;
            }
            n >>= 1; // 移位
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countOne(7));
        System.out.println(countOne(8));
    }
}
