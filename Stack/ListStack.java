package Stack;

import Recurrsion.removeDuplicate;

public class ListStack {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;
    static Node tail;

    // prev
    static Node trav() {
        Node prev = null;
        Node temp = head;

        if (head == null) {
            return null;
        }
        while (temp != null) {
            prev = temp;
            temp = temp.next;
        }
        return prev;
    }

    // push
    static void push(int data) {
        Node temp = head;
        Node newNode = new Node(data);
        if (temp == null) {
            head = tail = newNode;
        } else {
            Node last = trav();
            last.next = newNode;
        }
        System.out.println("data pushed");
    }

    // pop
// pop
static void pop() {
    if (head == null) {
        System.out.println("Underflow: Stack is empty");
        return;
    }

    Node temp = head;

    if (head.next == null) {
        // Only one element in the list
        head = tail = null;
    } else {
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;

        // Check if the stack becomes empty after popping
        if (temp == null) {
            head = tail = null;
        }
    }
    System.out.println("data popped");
}



    // peek
    static void peek() {
        Node temp = trav();
        if (temp != null) {
            System.out.println(temp.data);
        } else {
            System.out.println("Stack is empty");
        }
    }

    // display
    static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String args[]) {
        System.out.println("Enter the data in the stack");
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        display();
        System.out.println();
        pop();
        pop();
        display();
        System.out.println();
        peek();
    }
}
