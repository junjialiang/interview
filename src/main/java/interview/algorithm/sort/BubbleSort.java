package interview.algorithm.sort;

/**
 * @Author: Junjia
 * @Date: 2019-03-30 12:38
 * @Description: 如何进行冒泡排序
 */
public class BubbleSort {
    public static void bubbleSort(int array[]) {
        int i, j;
        int len = array.length;
        int tmp;
        for (i = 0; i < len - 1; ++i) {
            for (j = len - 1; j > i; --j) {
                if (array[j] < array[j - 1]) {
                    tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {5, 4, 9, 8, 7, 6, 0, 1, 3, 2};
        bubbleSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
}
