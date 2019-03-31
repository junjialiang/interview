package interview.datastructure.array;

/**
 * @Author: Junjia
 * @Date: 2019-03-30 19:41
 * @Description: 如何找出数组中第二大数
 */
public class SecondMax {
    public static int findSecMax(int data[]) {
        int count = data.length;
        int maxNumber = data[0];
        int secMax = Integer.MIN_VALUE;
        for (int i = 1; i < count; i++) {
            if (data[i] > maxNumber) {
                secMax = maxNumber;
                maxNumber = data[i];
            } else {
                if (data[i] > secMax) {
                    secMax = data[i];
                }
            }
        }
        return secMax;
    }

    public static void main(String[] args) {
        int[] array = {100, 7, 3, 19, 40, 4, 7, 1};
        System.out.println(findSecMax(array));
    }
}
