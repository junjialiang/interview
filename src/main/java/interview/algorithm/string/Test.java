package interview.algorithm.string;

/**
 * @Author: Junjia
 * @Date: 2019-03-31 13:55
 * @Description:如何实现字符串的反转
 */
public class Test {
    public void swap(char[] cArr, int front, int end) {
        while (front < end) {
            char tmp = cArr[end];
            cArr[end] = cArr[front];
            cArr[front] = tmp;
            front++;
            end--;
        }
    }

    public String swapWords(String s) {
        char[] cArr = s.toCharArray();
        // 对整个字符串进行字符反转操作
        swap(cArr, 0, cArr.length - 1);
        int begin = 0;
        // 对每个单词进行字符反转操作
        for (int i = 0; i < cArr.length; i++) {
            if (cArr[i] == ' ') {
                swap(cArr, begin, i - 1);
                begin = i + 1;
            }
        }
        swap(cArr, begin, cArr.length - 1);
        return new String(cArr);
    }

    public static void main(String[] args) {
        String str = "how are you";
        System.out.println(new Test().swapWords(str));
    }
}
