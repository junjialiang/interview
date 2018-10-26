package interview.basic;

/**
 * 以下代码执行后输出结果为（ ）
 * Created by liangjunjia on 2018/10/14.
 */
public class ClassTest {
    private String str = "hello";
    private char[] ch = {'a', 'b', 'c'};

    private void fun(String str, char ch[]) {
        str = "world";
        ch[0] = 'd';
    }

    public static void main(String[] args) {
        ClassTest test1 = new ClassTest();
        test1.fun(test1.str, test1.ch);
        System.out.print(test1.str + " and ");
        System.out.print(test1.ch);
    }
}