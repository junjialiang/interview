package interview.datastructure.array;

/**
 * @Author: Junjia
 * @Date: 2019-03-31 08:53
 * @Description: 如何把一个数组循环右移k位
 */
public class Test3 {
    public static void reverse(int a[], int b, int e) {
        for (; b < e; b++, e--) {
            int temp = a[e];
            a[e] = a[b];
            a[b] = temp;
        }
    }

    public static void shiftK(int a[], int k) {
        int n = a.length;
        k = k % n; // 为了防止k比n大，右移k位跟右移k%n位的结果是一样的
        reverse(a, n - k, n - 1);
        reverse(a, 0, n - k - 1);
        reverse(a, 0, n - 1);
    }

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8};
        shiftK(array, 2);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
