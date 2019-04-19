package interview.algorithm.sort;

/**
 * @Author: Junjia
 * @Date: 2019-03-30 12:38
 * @Description: 如何进行冒泡排序
 */
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {//-1为了防止溢出
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {5, 4, 9, 8, 7, 6, 0, 1, 3, 2};
        bubbleSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
