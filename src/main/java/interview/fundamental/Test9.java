package interview.fundamental;

/**
 * 应用程序的main方法中有以下语句，则输出的结果( )
 * Created by liangjunjia on 2018/10/19.
 */
public class Test9 {
    public static void main(String[] args) {
        String s1 = new String("xyz ");
        String s2 = new String("xyz ");
        Boolean b1 = s1.equals(s2);
        Boolean b2 = (s1 == s2);
        System.out.print(b1 + " " + b2);
    }
}
