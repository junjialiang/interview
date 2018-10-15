package interview.fundamental;

/**
 * 以下代码执行的结果显示是多少（ ）？
 * Created by liangjunjia on 2018/10/15.
 */
public class Test5 {
    class Super {
        int flag = 1;

        Super() {
            test();
        }

        void test() {
            System.out.println("Super.test() flag=" + flag);
        }
    }

    class Sub extends Super {
        Sub(int i) {
            flag = i;
            System.out.println("Sub.Sub()flag=" + flag);
        }

        void test() {
            System.out.println("Sub.test()flag=" + flag);
        }
    }

    public static void main(String[] args) {
        new Test5().new Sub(5);
    }
}
