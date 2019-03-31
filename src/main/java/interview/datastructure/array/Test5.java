package interview.datastructure.array;

/**
 * @Author: Junjia
 * @Date: 2019-03-31 09:36
 * @Description:如何找出数组中唯一的重复元素
 */
public class Test5 {
    public static int xorFindDup(int[] a) {
        int n = a.length;
        int tmp1 = 0;
        int tmp2 = 0;
        for (int i = 0; i < n - 1; ++i) {
            tmp1 += (i + 1);
            tmp2 += a[i];
        }
        tmp2 += a[n - 1];
        int result = tmp2 - tmp1;
        return result;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 3};
        int missionNum = xorFindDup(a);
        System.out.println(missionNum);
    }
}
