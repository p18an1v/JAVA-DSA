package LinkedListRev;


//Logical error in this code
import stackOp.stackCreation;

public class mergeSortInLL {

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;
    static Node tail;

    static void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // print
    public static void printFun() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    // finding mid node by slow fast
    static Node midFun() {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static Node merge(Node h1, Node h2) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while (h1 != null && h2 != null) {

            if (h1.data > h2.data) {
                temp.next = h2;
                h2 = h2.next;
                temp = temp.next;
            } else {
                temp.next = h1;
                h1 = h1.next;
                temp = temp.next;
            }

        }

        while (h1 != null) {
            temp.next = h1;
            h1 = h1.next;
            temp = temp.next;
        }

        while (h2 != null) {
            temp.next = h2;
            h2 = h2.next;
            temp = temp.next;
        }

        return mergeLL.next;

    }

    static Node mergeSort(Node head) {

        if (head == null && head.next == null) {
            return head;
        }

        Node mid = midFun();
        // starting of right head
        Node rightHead = mid.next;
        mid.next = null;
        // divid the linklist
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft, newRight);
    }

    public static void main(String[] args) {
        addFirst(1);
        addFirst(3);
        addFirst(5);
        addFirst(2);
        addFirst(6);
        printFun();
        head =  mergeSort(head);
        printFun();

    }
}
