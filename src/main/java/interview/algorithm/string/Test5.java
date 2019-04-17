package interview.algorithm.string;

/**
 * @Author: Junjia
 * @Date: 2019-03-31 18:11
 * @Description:如何输出字符串的所有组合
 */
public class Test5 {
    public static void combineRecursiveImpl(char[] c, int begin, int len, StringBuffer sb) {
        if (len == 0) {
            System.out.print(sb + " ");
            return;
        }
        if (begin == c.length) {
            return;
        }
        sb.append(c[begin]);
        combineRecursiveImpl(c, begin + 1, len - 1, sb);
        sb.deleteCharAt(sb.length() - 1);
        combineRecursiveImpl(c, begin + 1, len, sb);
    }

    public static void main(String[] args) {
        String s = "abc";
        char[] c = s.toCharArray();
        StringBuffer sb = new StringBuffer("");
        int len = c.length;
        for (int i = 1; i <= len; i++) {
            combineRecursiveImpl(c, 0, i, sb);
        }
    }
}
