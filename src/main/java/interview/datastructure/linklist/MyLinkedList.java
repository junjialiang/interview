package interview.datastructure.linklist;


import java.util.Hashtable;

/**
 * 如何实现单链表的增删操作
 * Created by liangjunjia on 2019/3/29.
 */
public class MyLinkedList {
    Node head = null; // 链表头的引用

    /**
     * 向链表中插入数据
     *
     * @param d：插入数据的内容
     */
    public void addNode(int d) {
        Node newNode = new Node(d);
        if (head == null) {
            head = newNode;
            return;
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        // add node to end
        tmp.next = newNode;
    }

    /**
     * 删除第 index 个结点
     *
     * @param index
     * @return 成功返回ture，失败返回false
     */
    public Boolean deleteNode(int index) {
        if (index < 1 || index > length()) {
            return false;
        }
        // 删除链表第一个元素
        if (index == 1) {
            head = head.next;
            return true;
        }
        int i = 2;
        Node preNode = head;
        Node curNode = preNode.next;
        while (curNode != null) {
            if (i == index) {
                preNode.next = curNode.next;
                return true;
            }
            preNode = curNode;
            curNode = curNode.next;
            i++;
        }
        return true;
    }

    /**
     * @return 返回结点的长度
     */
    public int length() {
        int length = 0;
        Node tmp = head;
        while (tmp != null) {
            length++;
            tmp = tmp.next;
        }
        return length;
    }

    /**
     * 对链表进行排序
     *
     * @return 返回排序后的头结点
     */
    public Node orderList() {
        Node nextNode = null;
        int temp = 0;
        Node curNode = head;
        while (curNode.next != null) {
            nextNode = curNode.next;
            while (nextNode != null) {
                if (curNode.data > nextNode.data) {
                    temp = curNode.data;
                    curNode.data = nextNode.data;
                    nextNode.data = temp;
                }
                nextNode = nextNode.next;
            }
            curNode = curNode.next;
        }
        return head;
    }

    /**
     * 打印链表
     */
    public void printList() {
        Node tmp = head;
        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }

    /**
     * 从何从链表中删除重复数据
     *
     * @param head
     */
    public void deleteDuplecate(Node head) {
        Hashtable<Integer, Integer> talbe = new Hashtable<>();
        Node tmp = head;
        Node pre = null;
        while (tmp != null) {
            if (talbe.containsKey(tmp.data)) {
                pre.next = tmp.next;
            } else {
                talbe.put(tmp.data, 1);
                pre = tmp;
            }
            tmp = tmp.next;
        }
    }

    /**
     * 如何实现链表的反转
     *
     * @param head
     */
    public void reverseIteratively(Node head) {
        Node pReversedHead = head;
        Node pNode = head;
        Node pPrev = null;
        while (pNode != null) {
            Node pNext = pNode.next;
            if (pNext == null) {
                pReversedHead = pNode;
            }
            pNode.next = pPrev; // 指针反转
            pPrev = pNode; // 将当前节点保存，以便下一次反转指向
            pNode = pNext; // 指针移动到下一个节点
        }
        this.head = pReversedHead;
    }

    /**
     * 如何从尾到头输入单链表
     *
     * @param pListHead
     */
    public void printListReversely(Node pListHead) {
        if (pListHead != null) {
            printListReversely(pListHead.next);
            System.out.println(pListHead.data);
        }
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addNode(5);
        list.addNode(3);
        list.addNode(1);
        list.addNode(3);
        System.out.println("listlen=" + list.length());
        System.out.println("before order:");
        list.printList();
        list.orderList();
        System.out.println("after order:");
        list.printList();

        // 如何从尾到头输入单链表
        System.out.println("从尾到头输入单链表:");
        list.printListReversely(list.head);
    }
}


