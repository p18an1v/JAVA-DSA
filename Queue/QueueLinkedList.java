

public class QueueLinkedList {
    
    static class Node{

        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null;
    public static Node tail = null;

    public static boolean isEmpty(){
        return head == null && tail == null;
    }

    public static void add(int data){
        Node newNode = new Node(data);

        if(isEmpty()){
            head = tail = newNode;
        }
        else{

            tail.next = newNode;
            tail = newNode;
        }
    }

    static void remove(){

        if(isEmpty()){
            System.out.println("Queue is emoty");
        }
        int fornt = head.data;
        //single element
        if(head == tail){
            tail = head = null;
        }{
            head = head.next;
        }
    }

    static void print(){
        Node temp = head;

        while(temp!= null){
            System.out.print(temp.data+"->");
            temp = temp.next;
            
        }
    }

    static void peek(){
        if(isEmpty()){
            System.out.println("emty");
        }
        System.out.println(head.data);
    }

    public static void main(String[] args) {
        
        add(1);
        add(2);
        add(3);
        add(4);
        add(5);
        print();
        peek();
    }
}
