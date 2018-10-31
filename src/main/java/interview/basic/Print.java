package interview.basic;

/**
 * 以下程序的输出结果是
 * Created by liangjunjia on 2018/10/31.
 */
public class Print {
    static boolean out(char c) {
        System.out.print(c);
        return true;
    }

    public static void main(String[] argv) {
        int i = 0;
        for (out('A'); out('B') && (i < 2); out('C')) {
            i++;
            out('D');
        }
    }
}

