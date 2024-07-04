package LinkList;

import Basics.reversNumber;

public class CreateLinkList {
    
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

    public void addMiddle(int data, int idx){


     Node newNode = new Node(data);
     size++;
     Node temp = head;

     if(idx == 0){
        addFirst(data);
        return;
     }
     int i = 0;

     while (i<idx-1) {
        temp = temp.next;
        i++;
     }
     newNode.next = temp.next; // new node conection build karta na
     temp.next=newNode; //previsous node chi link
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


    //Deletion Opration
    public int removeFirst(){
        if(size == 0){
            System.out.println("LinkList is empty ");
            return Integer.MIN_VALUE;
        }else if(size==1){

            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("LinkList is empty ");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = tail.data;
            head = tail = null;
            size =0;
            return val;
        }else{
        
            //prv  kad nay sathi i = size-2; pariyanta jaycha
            Node prv =head;
            for(int i = 0; i<size-2;i++)
            {
                prv = prv.next;
            }
            int val = tail.data;
            prv.next = null;
            tail = prv;
           // val  = prv.next.data;
            size--;
        return val;
        }
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


    //reverse
    public void reverse(){
        Node prv = null;
        Node curr = head;
        Node next;
        while(curr!=null){

            next = curr.next;
            curr.next =prv;
            prv = curr;
            curr= next;
        }
        head = prv;
    }

    //remove nth node
    public void removeNthNode(int key){

        //calculate size first
        int sz = 0;
        Node temp = head;
        while(temp!= null){
            temp = temp.next;
            sz++;
        }

        // checking the if head is the key to remove or not
       if(key==sz){
              head = head.next;
              return;
       }

       //for rest of the node find prev
       int i = 1;
       int iToFind = sz-key;
       Node prv = head;
       while (i<iToFind) {
        prv = prv.next;
        i++;
       }
       prv.next = prv.next.next;
       return;
    }


     // find the mid first 
     public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next == null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
     }

    public boolean palinfrom(){

        // mid
        Node mid = findMid(head);

        // 2nd half reverse
        Node prev= null;
        Node curr = mid;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr =next;
        }
        
        Node right = prev ;//  right half head;
        Node left = head; // left half head;

        //check 1st half is == 2nd half
        while(right!=null) {
            if(right.data != left.data){
              return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
       

    }
        
    

    public static void main(String[] args) {
        CreateLinkList ll = new CreateLinkList();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addFirst(5);
       /*  ll.addMiddle(9, 2);
        ll.printll();
        System.out.println(ll.size+" is size of the linkList ");
        ll.removeFirst();
        ll.printll();
        System.out.println(ll.size+" is size of the linkList ");
        ll.removeLast();
        ll.printll();
        System.out.println(ll.size+" is size of the linkList ");
        ll.reverse();
        ll.printll(); */
        ll.removeNthNode(4);
        ll.printll();

        System.out.println(ll.palinfrom());

    }

}
