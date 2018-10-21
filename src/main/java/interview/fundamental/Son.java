package interview.fundamental;

/**
 * 运行下面代码，输出的结果是（）
 * Created by liangjunjia on 2018/10/10.
 */
class Father {
    Father() {
        System.out.println("class Father");
    }

    {
        System.out.println("I'm Father class");
    }

    static {
        System.out.println("class Father static");
    }
}


public class Son extends Father {
    private Son() {
        System.out.println("class Son");
    }

    {
        System.out.println("I'm Son class");
    }

    static {
        System.out.println("class Son static");
    }

    public static void main(String[] args) {
        new Son();
    }
}
