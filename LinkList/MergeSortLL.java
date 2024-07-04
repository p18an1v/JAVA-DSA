package LinkList;

import String.string;

public class MergeSortLL {
    
    public static class Node {
      
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next = null;
        }
    }

    public void addFirst(int data){
        Node newNode  = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void printll() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;  // Add this line to move to the next node
        }
        System.out.println("null");  // To indicate the end of the linked list
    }
    

    public static Node head;
    public static Node tail;

    //find mid by slow and fast technique
    public Node getMid(Node head){
        Node slow = head;
        Node fast = head.next; // this small change will give the last node from first half as a mid
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    public Node merge(Node head1, Node head2){

        //created new LL
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1!=null && head2!=null){

            if(head1.data<head2.data){
                temp.next=head1;
                //update 
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next=head2;
                //update 
                head2 = head2.next;
                temp = temp.next;

            }
        }

        //remaining elements
        while(head1!=null){
            temp.next=head1;
            //update 
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2!=null){
            temp.next=head2;
            //update 
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;

    }

    public Node mergeSort(Node head){
        if(head == null || head.next==null){
            return head;
        }
    
        //get mid 
        Node mid = getMid(head);
    
        Node rightHead = mid.next;
        mid.next=null;
        //divid the link list
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
    
        //merge
        return merge(newLeft,newRight);
    }
    public static void main(String[] args) {
        MergeSortLL ll = new MergeSortLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.printll();
        ll.head=ll.mergeSort(ll.head);
        ll.printll();

    }
}
