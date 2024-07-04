package LinkedListRev;

import Basics.breakLoop;
import Recurrsion.tilingProblem;

public class CircularLL {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node head;
    public static Node tail;

    // add at begingin
    static void addAtHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head; // pointing back itself for circularity
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newNode.next = head;
            head = newNode;
            temp.next = head; // update last to point back to new head
        }
    }

    // add at end before the head
    static void addAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head; // pointing back itself for circularity
        } else {

            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }

            temp.next = newNode;
            newNode.next = head;
        }
    }

    // add at specific position
    static void addAtPos(int data, int Idx) {

        Node newNode = new Node(data);
        if (head == null) {
            System.out.println("List is Emty");
            return;
        }
        if (Idx == 0) {
            addAtHead(data);
        }
        int i = 0;
        Node temp = head;
        while (temp.next != head && i < Idx - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;

    }

    // delete at the begining
    static int delAtBeg() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is Emty");
        }
        int data;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = head.next;
        data = head.data;
        head = head.next;
        return data;

    }

    //delete at end
    static int delAtEnd() {
        Node curr = head;
        Node prev = null;
        if (head == null) {
            System.out.println("List is Emty");
        }

        while (curr.next != head) {
            prev = curr;
            curr = curr.next;
        }

        if (prev == null) {
            System.out.println("Only One node in the list");
        }
        int data = curr.data;
        prev.next = head;

        return data;
    }

    //delete at specific position
    static int delAtpos(int pos){

        if(head == null){
            System.out.println("List is Empty");
        }
        Node curr = head;
        Node prev = null;
        int i = 0;
        while(i<pos-1 && curr.next!=null){
            prev = curr;
            curr= curr.next;
            i++;
        }
        if (curr == head) {
            System.out.println("Position not found");
            return -1; // Return -1 to indicate failure or handle it as needed
        }
        int data = curr.data;
        prev.next = curr.next;
        return data;
    }

    // print the circular linklist
    static void displayCLL() {
        Node curr;
        curr = head;

        if (curr == null) {
            System.out.println("List is Empty");
            return;
        }

        do {
            System.out.print(curr.data + "->");
            curr = curr.next;
        } while (curr != head);
        System.out.print("head");

    }

    static boolean isCircular(){

        if(head == null){
            System.out.println("List is Emty No cycle is there");
        }

        //floyds cycle finding algorithm
        Node rabbit = head;
        Node turtle = head;

        while(rabbit != null && rabbit.next!=null){
            if(rabbit == turtle){
                System.out.println("Cycle is Present");
                return true;
            }
            rabbit = rabbit.next.next;
            turtle= turtle.next;
        }
        System.out.println("Cycle is Not present");;
        return false;
    }

    //remove cycle in circular linked list
    static void removeCycle(){

        // first detect cycle
        // find meeting point
        // remove cycle
        Node fast = head;
        Node slow = head;
        Node prev = null;
        boolean cycle = false;

        while (fast != null && fast.next!= null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                return;
            }
        }

        if(cycle == false){
            return;
        }

        //meeting point
        slow = head;
        while (slow!=fast) {
            slow = slow.next;
            fast = fast.next;
            prev=fast;
        }

        prev.next = null;
        System.out.println("cycle is removed");

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

    public static void main(String args[]) {

        // addToEmpty(head, 2);
        addAtHead(1);
        addAtHead(2);
        addAtHead(3);
        addAtHead(4);
        addAtTail(6);
        addAtPos(7, 2);
        displayCLL();
        System.out.println();
        //delAtBeg();
        //delAtEnd();
        delAtpos(5);
        displayCLL();
        System.out.println();
        isCircular();
       // displayCLL();
        System.out.println();
       // removeCycle();
    }

}
