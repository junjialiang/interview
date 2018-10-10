package interview.fundamental;

/**
 * 运行下面代码，输出的结果是（）
 * Created by liangjunjia on 2018/10/10.
 */
class A {
    A() {
        System.out.println("class A");
    }

    {
        System.out.println("I'm A class");
    }

    static {
        System.out.println("class A static");
    }
}


public class B extends A {
    private B() {
        System.out.println("class B");
    }

    {
        System.out.println("I'm B class");
    }

    static {
        System.out.println("class B static");
    }

    public static void main(String[] args) {
        new B();
    }
}
