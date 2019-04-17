package interview.algorithm.string;

/**
 * @Author: Junjia
 * @Date: 2019-03-31 17:16
 * @Description:如何删除字符串中重复的字符
 */
public class Test3 {
    public static String removeDuplicate(String str) {
        char[] c = str.toCharArray();
        int len = c.length;
        for (int i = 0; i < len; i++) {
            if (c[i] == '\0') {
                continue;
            }
            for (int j = i + 1; j < len; j++) {
                if (c[j] == '\0') {
                    continue;
                }
                // 把重复的字符置为'\0'
                if (c[i] == c[j]) {
                    c[j] = '\0';
                }
            }
        }
        int l = 0;
        // 去掉'\0'
        for (int i = 0; i < len; i++) {
            if (c[i] != '\0') {
                c[l++] = c[i];
            }
        }
        return new String(c, 0, l);
    }

    public static void main(String[] args) {
        String str = "abcaabcd";
        str = removeDuplicate(str);
        System.out.println(str);
    }
}
