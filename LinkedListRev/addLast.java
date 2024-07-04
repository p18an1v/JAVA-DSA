package LinkedListRev;

import Recurrsion.lastOccurence;

public class addLast {
    
    public static class Node {
    
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next= null;
        }
    }

    public static Node head;
    public static Node tail;

    //addLast
    public static void last(int data){

        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    //printing
    public static void printFun() {
        Node temp = head;
       
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        last(1);
        last(2);
        last(3);
        last(4);
        printFun();
        
    }
}
