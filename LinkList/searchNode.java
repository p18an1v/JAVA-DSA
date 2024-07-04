package LinkList;

public class searchNode {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;


    public void addFirst(int data){

        //Create new Node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
        }
        // now assig new node cha next la previsous head
        newNode.next = head;
        // aata head la new node kar
        head = newNode;
    }

    public void addLast(int data){

        //Create new Node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }else{
        //aata tail cha next la newNode la dela 
        tail.next = newNode;
        // aata new Node la tail karun takla
        tail= newNode;
      }
    }

   

    public void printll(){

        Node temp = head;
        if(head == null){
            System.out.println("Link List is empty ");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.err.println();
    }


   

    //search
    public int search(int key){

        int i = 0;
        Node temp = head;
        while (temp != null) {
            i++;
            if(temp.data == key){
                System.out.println("key is at idx "+ i);
            }
            temp = temp.next;
        }
        return -1;
    }

     //remove search node
    public int  removeSearchNode(int key){

        Node temp = head;
        Node prv  = null;

        while (temp != null && temp.data == key) {
            temp = temp.next;
            prv = temp;
        }

        if(temp == null){
            System.out.println("key not fount in the list ");
            return -1;
        }
        if(prv == null){
            // if key is in the head
            head = temp.next;
        }else{
            //if key is in the middle or last element
            prv.next = temp.next.next;
            size--;
        }
        int val = temp.data;
        return -1;
    }

    public int helperFun(Node head, int key) {
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int idx = helperFun(head.next, key);

        if (idx != -1) {
            return idx + 1;
        }

        return -1;
    }
    public int recSearch(int key){
        return helperFun(head, key);
    }

    public static void main(String[] args) {
        searchNode ll = new searchNode();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addFirst(5);
        ll.printll();
        ll.search(3);
       System.out.println( ll.recSearch(3));
       ll.removeSearchNode(4);
        ll.printll();

    }
}
   