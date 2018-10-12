package interview.fundamental;

/**
 * 下列程序执行后结果为( )
 * Created by liangjunjia on 2018/10/12.
 */
class AA {
    public int func1(int a, int b) {
        return a - b;
    }
}

class BB extends AA {
    public int func1(int a, int b) {
        return a + b;
    }
}

public class ChildClass {
    public static void main(String[] args) {
        AA a = new BB();
        BB b = new BB();
        System.out.println("Result=" + a.func1(100, 50));
        System.out.println("Result=" + b.func1(100, 50));
    }
}
