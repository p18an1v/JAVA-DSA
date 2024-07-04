package LinkedListRev;

public class addSpecific {

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

    // add specific location
    static void addOnLoct(int data, int idx) {
        Node temp = head;
        Node newNode = new Node(data);

        // List empty
        if(head == null){
            head = tail = newNode;
        }

        //jar nasel tar check kar 
        int i = 0;
        while(i == idx-1 && temp.next != null){
            i++;
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = temp.next;
    }

    // printing
    public static void printFun() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        addOnLoct(1, 0);
        addOnLoct(2, 0);
        addOnLoct(0, 0);
        printFun();
    }
}
