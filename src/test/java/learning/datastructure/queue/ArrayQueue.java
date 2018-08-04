package learning.datastructure.queue;

/**
 * 数组实现“队列”，只能存储int数据。
 * Created by liangjj on 2017/10/11.
 */
public class ArrayQueue {
    private int[] mArray;
    private int mCount;

    private ArrayQueue(int size) {
        mArray = new int[size];
        mCount = 0;
    }

    // 将val添加到队尾
    private void add(int val) {
        mArray[mCount++] = val;
    }

    // 返回“队首”
    private int front() {
        return mArray[0];
    }

    // 返回“队首元素”，并删除“队首元素”
    private int pop() {
        int ret = mArray[0];
        mCount--;
        System.arraycopy(mArray, 1, mArray, 0, mCount);
        return ret;
    }

    // 返回“队列”的大小
    private int size() {
        return mCount;
    }

    // 返回“队列”是否为空
    private boolean isEmpty() {
        return size() == 0;
    }

    public static void main(String[] args) {
        int tmp;
        ArrayQueue arrayQueue = new ArrayQueue(12);

        // 将10, 20, 30 依次入队列
        arrayQueue.add(10);
        arrayQueue.add(20);
        arrayQueue.add(30);

        // 将“队首”赋值给tmp，并删除“队首”
        tmp = arrayQueue.pop();
        System.out.printf("tmp=%d\n", tmp);

        // 只将“队首”赋值给tmp，不删除该元素.
        tmp = arrayQueue.front();
        System.out.printf("tmp=%d\n", tmp);

        arrayQueue.add(40);

        System.out.printf("isEmpty()=%b\n", arrayQueue.isEmpty());
        System.out.printf("size()=%d\n", arrayQueue.size());
        while (!arrayQueue.isEmpty()) {
            System.out.printf("size()=%d\n", arrayQueue.pop());
        }
    }
}