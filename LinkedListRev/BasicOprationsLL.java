package LinkedListRev;

import stackOp.stackCreation;

public class BasicOprationsLL {

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // Adding the data in the list

    // Add head
    public static void addHead(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // add tail
    public static void addTail(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // add middle or specific position
    public static void addAtPosition(int data, int pos) {
        Node newNode = new Node(data);

        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        int i = 0;
        while (i < pos - 1 && temp != null) {
            i++;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Deleting the data from the List
    public static int delHead() {
        int data;
        if (head == null) {
            System.out.println("List is empty");
        }
        data = head.data;
        head = head.next;
        return data;
    }

    // delete tail
    public static int delTail() {
        int data;
        Node temp = head;

        if (head == null) {
            System.out.println("List is empty");
        }

        // specail case if only one elemnet in the list
        if (head.next == null) {
            data = head.data;
            head = null;
            return data;
        }

        while (temp.next.next != null) {
            temp = temp.next;
        }
        data = temp.next.data;
        temp.next = null;
        return data;
    }

    // deleting the middle or any position element
    public static int delPos(int Idx) {
        int data;
        Node temp = head;

        if (head == null) {
            System.out.println("List is empty");
        }
        if (head.next == null) {
            System.out.println("Only one element is present ->" + head.data);
        }

        int i = 0;
        while (i < Idx - 1 && temp != null) {
            temp = temp.next;
        }
        data = temp.data;
        temp.next = temp.next.next;
        return data;
    }

    // search any element in linklist
    public static void search(int key) {

        Node temp = head;
        if (head == null) {
            System.out.println("List is empty");
        }

        int i = 0;
        while (temp != null) {

            if (temp.data == key) {
                System.out.print(key + " KEY VALUE FOUND AT POSITION " + i);
            }
            temp = temp.next;
            i++;
        }

    }

    // Reverse the linked list
    static void reverse() {
        Node curr = head;
        Node prev = null;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
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

    public static void main(String[] args) {
        addHead(1);
        addTail(2);
        addTail(4);
        addTail(5);
        addTail(6);
        addAtPosition(3, 1);

        printFun();
        System.out.println();
        reverse();
        printFun();
        // delHead();
        // delTail();
        // delPos(1);
        // search(4);
        // printFun();
    }
}

