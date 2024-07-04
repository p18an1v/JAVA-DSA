package LinkList;

public class detectCycleLinkList {
    

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
    public static Node prev;

    public void addElem(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }else{
        head.next = newNode;
         head  =newNode;
        }
    }

    public boolean checCycle(){
        Node slow   = head ;
        Node fast = head;
        while (fast != null && fast.next !=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                
                return true;
            }
        }
        return false;
    }

    public void RemoceCycle(){
        //dectect cycle
        Node slow  = head;
        Node fast = head;
        boolean cycle ; // flag
        while (fast != null && fast.next == null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle  = true;
                break;
            }
        }
        if(cycle = false){
           return;
        }

        //find the meeting point
        slow = head ;
        Node prev = null;
         while(slow!=fast){
            prev = fast;
            slow=slow.next;
            fast = fast.next;
         }

         //remove cycle  last.next = null;
         prev.next = null;
    }

    public void printll(){
        Node temp = head;
        if (head == null) {
            System.out.println("Link List is empty ");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        detectCycleLinkList ll = new detectCycleLinkList();
        ll.addElem(1);
        ll.addElem(2);
        ll.addElem(3);
        ll.addElem(4);
        ll.addElem(5);
        ll.addElem(1);
        System.out.println(ll.checCycle());
       
        ll.printll();
        ll.RemoceCycle();
        ll.printll();

    }
}
