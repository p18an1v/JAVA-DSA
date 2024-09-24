package Revision;

public class stackLinkedList {
    
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    //overflow concept is not there in linked list
    //push
    


    static void push(int data){

        Node  newNode  = new Node(data);

        if(head==null){
            head = tail = newNode;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = null;
        }
    }

    static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // public static void printTopToBottom(){

    //     int count = 0;
    //     Node temp = head;
    //     while(temp != null){
    //         temp = temp.next;
    //         count++;
    //     }

    //     Node prev = null;
    //     for(int i = 0; i<count; i++){
            
    //     }


    // }


    static void pop(){

        Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
    }

    static void pick(){

        Node temp = head;
        while(temp.next!=null){

            temp = temp.next;

        }

        System.out.println(temp.data);

    }
    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        display();
        //pop();
        System.out.println();
        display();
        pick();
    }
}
