package LinkList;

public class zigzagLL {
    
    public static class Node {
      
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    //printing
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
        System.err.print("null");
    }

    //add first
    public void addFirst(int data){
        Node newNode  = new Node(data);
        newNode.next = head;
        head = newNode;
    }


    public void zigzag(){
        //mid
        Node slow = head;
        Node fast = head.next;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;


        //2nd half reverse
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next = prev;
            prev = curr;
            curr=next;
        }


        //Logic for zig zag
        Node left = head;
        Node right = prev;
        Node nextL,nextR;

        //alter placedment kay cah ahai 
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
            left = nextL;
            right = nextR; 
        }
    }

    public static void main(String[] args) {
        zigzagLL ll = new zigzagLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.printll();
        System.out.println();
        ll.zigzag();
        ll.printll();
    }
}
