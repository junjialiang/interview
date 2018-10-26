package interview.basic;

/**
 * 以下代码执行后输出结果为（ ）
 * Created by liangjunjia on 2018/10/16.
 */
public class Test6 {
    public static Test6 t1 = new Test6();

    {
        System.out.println("blockA");
    }

    static {
        System.out.println("blockB");
    }

    public static void main(String[] args) {
        Test6 t2 = new Test6();
    }
}
