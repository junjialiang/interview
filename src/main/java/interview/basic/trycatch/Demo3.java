package interview.basic.trycatch;

/**
 * 给定以下JAVA代码，这段代码运行后输出的结果是（）
 * Created by liangjunjia on 2018/10/25.
 */
public class Demo3 {
    private static int aMethod(int i) throws Exception {
        try {
            return i / 10;
        } catch (Exception ex) {
            throw new Exception("exception in a aMethod");
        } finally {
            System.out.printf("finally");
        }
    }

    public static void main(String[] args) {
        try {
            aMethod(0);
        } catch (Exception ex) {
            System.out.printf("exception in main");
        }
        System.out.printf("finished");
    }
}