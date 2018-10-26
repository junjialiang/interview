package interview.basic;

/**
 * 关于以下程序代码的说明正确的
 * Created by liangjunjia on 2018/10/20.
 */
public class HasStatic {

    private static int x = 100;

    public static void main(String args[]) {
        HasStatic hs1 = new HasStatic();
        hs1.x++;
        HasStatic hs2 = new HasStatic();
        hs2.x++;
        hs1 = new HasStatic();
        hs1.x++;
        HasStatic.x--;
        System.out.println("x=" + x);
    }
}

