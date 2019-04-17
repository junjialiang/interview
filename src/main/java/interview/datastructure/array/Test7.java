package interview.datastructure.array;

/**
 * @Author: Junjia
 * @Date: 2019-03-31 12:38
 * @Description:如何求指定数字在数组中第一次出现的位置
 */
public class Test7 {
    public static int findIndex(int a[], int t) {
        if (a == null) {
            return -1;
        }
        int len = a.length;
        int i = 0;
        while (i < len) {
            if (a[i] == t) {
                return i;
            } else {
                i += Math.abs(t - a[i]);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = {3, 4, 5, 6, 5, 6, 7, 8, 9, 8};
        System.out.println(findIndex(a, 9));
    }
}
