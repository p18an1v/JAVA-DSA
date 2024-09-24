package Stack;

public class revList{

    static class Node{
        int data;
        Node next;

        Node(int data){

            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    static boolean isEmpty(){
        return head == null;
    }


    //push
    static void push(int data){

        Node newNode = new Node(data);
        if(isEmpty()==true){
            head = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    //pop
    static int pop(){

        if(isEmpty() == true){
            return -1;
        }

        int top = head.data;
        head = head.next;
        return top;

    }

    //peek
    static int peek(){
        
        if(isEmpty()){
            return -1;
        }
        return head.data;
        
    }


    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);

        Node temp = head;
        while (temp != null) {
            System.out.println(peek());
            pop();
            temp = temp.next;
        }
    }

}