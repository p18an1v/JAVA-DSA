package LinkList;

public class circularLinkList {
    
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
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            newNode.next = head;
        }else{
            newNode.next = head;
            head = newNode;
            tail.next = newNode;
        }

    }
        
    
}
