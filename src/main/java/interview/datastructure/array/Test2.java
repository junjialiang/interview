package interview.datastructure.array;

/**
 * @Author: Junjia
 * @Date: 2019-03-30 21:46
 * @Description: 如何求数组中两两相加等于20的组合种数
 */
public class Test2 {
    public static void findSum(int[] a, int sum) {
        int len = a.length;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                if (a[i] + a[j] == sum) {
                    System.out.println(a[i] + "," + a[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int array[] = {1, 7, 17, 2, 6, 3, 14};
        findSum(array, 20);
    }
}
