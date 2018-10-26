package interview.basic;

/**
 * 以下代码执行的结果显示是多少（）？
 * Created by liangjunjia on 2018/10/21.
 */
public class Test11 {
    public static void main(String args[]) {
        int count = 0;
        int num = 0;
        for (int i = 0; i <= 100; i++) {
            num = num + i;
            count = count++;
        }
        System.out.println("num * count = " + (num * count));
    }
}