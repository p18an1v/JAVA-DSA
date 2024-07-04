package LinkList;

public class LinkListPalindrom {
    
    public static class Node {
     int data;
     Node next;

     Node(int data){
        this.data = data;
        this.next=null;
     }

     public static Node head;


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
        
    }
}
