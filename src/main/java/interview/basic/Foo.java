package interview.basic;

/**
 * 以下代码结果是什么？
 * Created by liangjunjia on 2018/10/10.
 */
public class Foo {
    public static void main(String sgf[]) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        operate(a, b);
        System.out.println(a + "." + b);
    }

    private static void operate(StringBuffer x, StringBuffer y) {
        x.append(y);
        y = x;
    }
}
