package LinkedListRev;

public class DoublyLL {

    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    static Node head;
    static Node tail;

    // add at begining
    static void addAtbeg(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // delete at begining
    static int delAtbeg() {
        if (head == null) {
            System.out.println("List is Empty nothing to delete");
            return -1;
        }
        int data;
        // for only one element
        if (head.next == null) {
            data = head.data;
            System.out.println("List is empty now..");
            return data;
        }

        // for more the one
        data = head.data;
        head = head.next;
        head.prev = null;
        return data;
    }

    // add at tail
    static void addAtTail(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            addAtbeg(data);
        }

        Node curr = head;
        Node prev = null;

        while (curr != null) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = newNode;
        newNode.next = null;
        newNode.prev = prev;
        tail = newNode;
    }

    // delete at tail
    static int delAtTail() {

        if (head == null) {
            System.out.println("List is Empty nothing to delete");
            return -1;
        }

        Node curr = head;
        Node prev = null;

        int data;
        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }
        data = curr.data;
        prev.next = null;
        curr.prev = null;
        tail = prev;
        return data;

    }

    // add at idx
    static void addAtIdx(int data, int idx) {
        Node newNode = new Node(data);
        Node curr = head;

        int i = 0;
        while (i < idx - 1 && curr != null) {
            curr = curr.next;
            i++;
        }

        newNode.next = curr.next;
        curr.next = newNode;
        newNode.prev = curr;

    }

    // delete at idx
    /* //Some thing is wrong in this code Logical error
    static int delAtIdx(int idx) {

        if (head == null) {
            System.out.println("List is Emty");
            return -1;
        }
        Node curr = head;
        Node prv = null;
        int i = 0;
        while (i < idx - 1 && curr != null) {
            prv = curr;
            curr = curr.next;
            i++;
        }

        int data = curr.data;

        if (curr.prev != null) {
            curr.prev.next = curr.next;
        }

        if (curr.next != null) {
            curr.next.prev = curr.prev;
        }
        return data;

    }
    */

    // printing
    static void printFun() {

        Node temp = head;
        System.out.print("null <-> ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null"); // Add a new line after printing the linked list
    }

    public static void main(String[] args) {

        addAtbeg(1);
        addAtbeg(2);
        printFun();
        System.out.println();
        // delAtbeg();
        addAtTail(3);
        // delAtTail();
        addAtIdx(4, 1);
        printFun();
        System.out.println();
      //  delAtIdx(1);
        printFun();
    }

}
