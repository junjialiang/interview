package interview.basic.extend;

/**
 * 下列程序执行后结果为( )
 * Created by liangjunjia on 2018/10/12.
 */
class Base {
    public int func1(int a, int b) {
        return a - b;
    }
}

class Sub extends Base {
    public int func1(int a, int b) {
        return a + b;
    }
}

public class ChildClass {
    public static void main(String[] args) {
        Base a = new Sub();
        Sub b = new Sub();
        System.out.println("Result=" + a.func1(100, 50));
        System.out.println("Result=" + b.func1(100, 50));
    }
}