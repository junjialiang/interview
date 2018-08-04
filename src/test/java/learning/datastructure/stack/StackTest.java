package learning.datastructure.stack;

import java.util.Stack;

/**
 * java集合包中的Stack的演示程序
 * Created by liangjj on 2017/10/11.
 */
public class StackTest {
    public static void main(String[] args) {
        int tmp;
        Stack<Integer> stack = new Stack<>();

        // 将10, 20, 30 依次推入栈中
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // 将“栈顶元素”赋值给tmp，并删除“栈顶元素”
        tmp = stack.pop();
        //System.out.printf("tmp=%d\n", tmp);

        // 只将“栈顶”赋值给tmp，不删除该元素.
        tmp = stack.peek();
        //System.out.printf("tmp=%d\n", tmp);

        stack.push(40);
        while (!stack.empty()) {
            tmp = stack.pop();
            System.out.printf("tmp=%d\n", tmp);
        }
    }
}
