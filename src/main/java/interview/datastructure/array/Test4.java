package interview.datastructure.array;

/**
 * @Author: Junjia
 * @Date: 2019-03-31 09:12
 * @Description:如何找出数组中只出现一次的数字
 */
public class Test4 {
    public static int findNotDouble(int a[]) {
        int n = a.length;
        int result = a[0];
        int i;
        for (i = 1; i < n; ++i) {
            result ^= a[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int array[] = {1, 2, 2,2};
        int num = findNotDouble(array);
        System.out.println(num);
    }
}
