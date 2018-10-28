package interview.basic;

/**
 * s=( )//s 的值是什么？
 * Created by liangjunjia on 2018/10/28.
 */
public class Demo5 {
    public static void main(String[] args) {
        int i = 5;
        int s = (i++) + (++i) + (i--) + (--i);
        System.out.println(s);
    }
}