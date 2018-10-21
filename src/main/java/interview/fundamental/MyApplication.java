package interview.fundamental;

/**
 * 阅读如下代码。 请问，对语句行 test8.hello(). 描述正确的有（）
 * Created by liangjunjia on 2018/10/18.
 */
class Test8 {
    static void hello() {
        System.out.println("hello");
    }
}

public class MyApplication {
    public static void main(String[] args) {
        Test8 test = null;
        Test8.hello();
    }
}
