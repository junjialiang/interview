package learning.datastructure.stack;

import java.lang.reflect.Array;

/**
 * 数组实现的栈，能存储任意类型的数据
 * Created by liangjj on 2017/10/11.
 */
public class GeneralArrayStack<T> {
    private static final int DEFAULT_SIZE = 12;
    private T[] mArray;
    private int count;

    private GeneralArrayStack(Class<T> type) {
        this(type, DEFAULT_SIZE);
    }

    @SuppressWarnings("unchecked")
    private GeneralArrayStack(Class<T> type, int size) {
        // 不能直接使用mArray = new T[DEFAULT_SIZE];
        mArray = (T[]) Array.newInstance(type, size);
        count = 0;
    }

    // 将val添加到栈中
    private void push(T val) {
        mArray[count++] = val;
    }

    // 返回“栈顶元素值”
    private T peek() {
        return mArray[count - 1];
    }

    // 返回“栈顶元素值”，并删除“栈顶元素”
    private T pop() {
        T ret = mArray[count - 1];
        count--;
        return ret;
    }

    // 返回“栈”的大小
    private int size() {
        return count;
    }

    // 返回“栈”是否为空
    private boolean isEmpty() {
        return size() == 0;
    }

    // 打印“栈”
    private void PrintArrayStack() {
        if (isEmpty()) {
            System.out.printf("learning.datastructure.stack is Empty\n");
        }

        System.out.printf("learning.datastructure.stack size()=%d\n", size());

        int i = size() - 1;
        while (i >= 0) {
            System.out.println(mArray[i]);
            i--;
        }
    }

    public static void main(String[] args) {
        String tmp;
        GeneralArrayStack<String> arrayStack = new GeneralArrayStack<>(String.class);

        // 将10, 20, 30 依次推入栈中
        arrayStack.push("10");
        arrayStack.push("20");
        arrayStack.push("30");

        // 将“栈顶元素”赋值给tmp，并删除“栈顶元素”
        tmp = arrayStack.pop();
        System.out.println("tmp=" + tmp);

        // 只将“栈顶”赋值给tmp，不删除该元素.
        tmp = arrayStack.peek();
        System.out.println("tmp=" + tmp);

        arrayStack.push("40");
        arrayStack.PrintArrayStack();    // 打印栈
    }
}
