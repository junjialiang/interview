package interview.datastructure.stack;

import interview.datastructure.Node;

/**
 * @Author: Junjia
 * @Date: 2019-03-30 11:59
 * @Description: 如何实现栈
 */
public class Stack {
    Node top = null;
    private int size; // 链表中存储元素的个数

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public Integer pop() {
        if (this.isEmpty()) {
            return null;
        }
        int data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public Integer peek() {
        if (isEmpty()) {
            return null;
        }
        return top.data;
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        System.out.println("栈中元素个数：" + s.size);
        System.out.println("栈顶元素为：" + s.pop());
        System.out.println("栈顶元素个数：" + s.pop());
    }
}
