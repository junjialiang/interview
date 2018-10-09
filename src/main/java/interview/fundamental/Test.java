package interview.fundamental;

/**
 * Test.main() 函数执行后的输出是（）
 * Created by liangjunjia on 2018/10/9.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(new B().getValue());
    }

    static class A {
        int value;

        A(int v) {
            setValue(v);
        }

        public void setValue(int value) {
            this.value = value;
        }

        int getValue() {
            try {
                value++;
                return value;
            } catch (Exception e) {
                System.out.println(e.toString());
            } finally {
                this.setValue(value);
                System.out.println(value);
            }
            return value;
        }
    }

    static class B extends A {
        B() {
            super(5);
            setValue(getValue() - 3);
        }

        public void setValue(int value) {
            super.setValue(2 * value);
        }
    }
}
