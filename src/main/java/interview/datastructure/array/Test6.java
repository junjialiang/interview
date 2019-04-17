package interview.datastructure.array;

/**
 * @Author: Junjia
 * @Date: 2019-03-31 11:58
 * @Description: 如何用递归方法求一个整数数组的最大元素
 */
public class Test6 {
    private int max(int a, int b) {
        return a > b ? a : b;
    }

    public int maxNum(int a[], int begin) {
        int length = a.length - begin;
        if (length == 1) {
            return a[begin];
        } else {
            return max(a[begin], maxNum(a, begin + 1));
        }
    }

    public static void main(String[] args) {
        Test6 t = new Test6();
        int[] num = {0, 16, 2, 3, 4, 5, 10, 7, 8, 9};
        System.out.println(t.maxNum(num, 0));
    }
}
