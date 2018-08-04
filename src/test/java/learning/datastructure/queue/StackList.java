package learning.datastructure.queue;

import java.util.Stack;

/**
 * 用“栈”实现队列
 * Created by liangjj on 2017/10/11.
 */
public class StackList<T> {
    // 向队列添加数据时：(01) 将“已有的全部数据”都移到mIn中。 (02) 将“新添加的数据”添加到mIn中。
    private Stack<T> mIn = null;
    // 从队列获取元素时：(01) 将“已有的全部数据”都移到mOut中。(02) 返回并删除mOut栈顶元素。
    private Stack<T> mOut = null;
    // 统计计数
    private int mCount = 0;

    private StackList() {
        mIn = new Stack<>();
        mOut = new Stack<>();
        mCount = 0;
    }

    private void add(T t) {
        // 将“已有的全部数据”都移到mIn中
        while (!mOut.empty())
            mIn.push(mOut.pop());

        // 将“新添加的数据”添加到mIn中
        mIn.push(t);
        // 统计数+1
        mCount++;
    }

    private T get() {
        // 将“已有的全部数据”都移到mOut中
        while (!mIn.empty())
            mOut.push(mIn.pop());
        // 统计数-1
        mCount--;

        // 返回并删除mOut栈顶元素
        return mOut.pop();
    }

    private int size() {
        return mCount;
    }

    private boolean isEmpty() {
        return mCount == 0;
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        StackList stackList = new StackList();

        // 将10, 20, 30 依次推入栈中
        stackList.add(10);
        stackList.add(20);
        stackList.add(30);

        System.out.printf("isEmpty()=%b\n", stackList.isEmpty());
        System.out.printf("size()=%d\n", stackList.size());
        while (!stackList.isEmpty()) {
            System.out.printf("%d\n", (int) stackList.get());
        }
    }
}
