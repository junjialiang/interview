package interview.algorithm.string;

/**
 * @Author: Junjia
 * @Date: 2019-03-31 17:52
 * @Description:如何统计一行字符中有多少个单词
 */
public class Test4 {
    public static int wordCount(String s) {
        int word = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                word = 0;
            } else if (word == 0) {
                word = 1;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "i am hehao";
        System.out.println(s);
        System.out.println("单词个数为:" + wordCount(s));
    }
}
