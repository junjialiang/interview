package interview.algorithm.string;

import java.util.Arrays;

/**
 * @Author: Junjia
 * @Date: 2019-03-31 14:35
 * @Description:如何判断两个字符串是否由相同的字符组成
 */
public class Test2 {
    public static void compare(String s1, String s2) {
        byte[] b1 = s1.getBytes();
        byte[] b2 = s2.getBytes();
        Arrays.sort(b1);
        Arrays.sort(b2);
        s1 = new String(b1);
        s2 = new String(b2);
        if (s1.equals(s2)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    public static void main(String[] args) {
        String s1 = "aaaabbc";
        String s2 = "abcbaaa";
        compare(s1, s2);
        s1 = "aaaabbc";
        s2 = "abcbaab";
        compare(s1, s2);
    }
}
