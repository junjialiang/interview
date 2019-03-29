package interview.datastructure.linklist;


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

    public void printList() {
        Node tmp = head;
        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
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

        System.out.println(list.deleteNode(5));

        System.out.println("after order:");
        list.printList();
    }
}


