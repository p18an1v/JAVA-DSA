package LinkedListRev;

public class addFirst {

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

    //first add
    public static void add(int data){

        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    //print
    public static void printFun(){
        Node temp = head;

        if(temp  == null){
            System.out.println("List is empty");
        }
        while (temp != null) {
            System.out.print(+temp.data+ "->");
            temp = temp.next;
        }
    }




    
    public static void main(String[] args) {

        add(9);
        add(4);
        add(5);
        printFun();
        
    }
}
