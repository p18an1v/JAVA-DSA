package Revision;

import Recurrsion.removeDuplicate;
import Stack.stackB;

public class LinkedList {
    

    public static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;


    public static void insertFromHead(int data){

        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    public static void insertFromTail(int data){

        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
        }else{

            Node temp = head;
            while(temp.next!= null){
                temp = temp.next;
            }
            temp.next = newNode;
            tail = newNode;
        }
    }

    public static void insertAtPos(int data,int pos){
        Node newNode = new Node(data);
        int count = 0;
        if(head == null){
            System.out.print("List is empty");
        }else{
            Node temp = head;
            while (temp != null && count == pos-1) {
                temp = temp.next;
                count++;
            }

            newNode.next = temp.next;
            temp.next = newNode;

        }
    }


    public static void printList(){

        Node temp = head;
        while(temp != null){
            System.out.print("->"+temp.data);
            temp = temp.next;

        }
    }

    public static int deleteFirst(){

        int data = 0;
        if(head == null){
            System.out.println("List is empty");
        }
             data = head.data;
             head = head.next;
             return data;
    }

    public static int deleteLast(){

        int data = 0;
        if(head == null){
            System.out.println("List is empty");
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
         data = temp.next.data;
         temp.next = null;
        
        return data;

    }

    public static int deletePos(int pos){

        if(head == null){
            System.out.println("List is Empty");
            return 0;
        }

        int count = 0;
        Node temp = head;
        while (temp!= null && count == pos-1) {
            temp = temp.next;
        }
        int data = temp.data;
        temp.next = temp.next.next;
        return data;
    }

    public static void reverse(){

        Node curr = head;
        Node prev = null;
        Node next = null;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev =curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String args[]){
        insertFromHead(1);
        insertFromHead(2);
        insertFromHead(3);
        insertFromTail(5);
        //printList();
        //insertAtPos(6, 2);
       // deleteFirst();
       //deleteLast();
       // deletePos(2);
       printList();
         reverse();
        printList();
    }
}
