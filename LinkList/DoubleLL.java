package LinkList;

public class DoubleLL {
    
    public static class  Node{
      
         int data;
         Node prev;
         Node next;

         Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
         }
        
    }

    public static Node head;
    public static Node tail;
    public static int size;

    void addFirst(int data){
        
         //Create new Node
         Node newNode = new Node(data);
         size++;
         if(head == null){
             head = tail = newNode;
             return;
         }
         // now assig new node cha next la previsous head
         newNode.next = head;
         head.prev = newNode;
         // aata head la new node kar
         head = newNode;

    }

    //remove first
    int removeFirst(){

        if(head == null){
           System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }

        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    void printll() {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" <-> ");
            temp = temp.next;
        }
        System.out.println("null");  // Add a new line after printing the linked list
    }

    //add last
    void addLast(int data){

        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
        }
        tail.next = newNode;
        newNode.next = null;
        newNode.prev = tail;
       
    }

    //remove last
    int removeLast(){
        if(head == null ){
            System.out.println(" DLL is empty ");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = tail.data;
            head = tail = null;
            size--;
            return val;
        }

        tail.prev = null;
        tail.next =null;
        size--;
        int val = tail.data;
        return val;
    }


    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.printll();
        dll.removeFirst();
        dll.printll();
        dll.addLast(5);
        dll.printll();
        dll.removeLast();
        dll.printll();

    }
}
