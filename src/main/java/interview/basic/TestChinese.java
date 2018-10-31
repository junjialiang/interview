package interview.basic;

/**
 * 下面代码的执行结果是 :
 * Created by liangjunjia on 2018/10/31.
 */
class Chinese {
    private static Chinese objref = new Chinese();

    private Chinese() {
    }

    static Chinese getInstance() {
        return objref;
    }
}

public class TestChinese {
    public static void main(String[] args) {
        Chinese obj1 = Chinese.getInstance();
        Chinese obj2 = Chinese.getInstance();
        System.out.println(obj1 == obj2);
    }
}
