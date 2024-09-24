

import java.util.Stack;

public class QueueUsingStack {

    // create a queue using 2 stack
    // there are two ways to ways to create queue
    //1. by poping the element 
    //2. by pusing the element

    //In this code we are using pushing element

    static class  Queue   {
    
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
        
        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        public static void add(int data){

            // jab tak s1 not get empty until then s1 element add into s2 and pop from s1 then add data 
            // into s1 and then s2 to s1 add data
            while (!s1.isEmpty()) {
                s2.add(s1.pop());
            }
            s1.push(data);

            while (!s2.isEmpty()) {
                s1.add(s2.pop());
            }
        }

        public static int remove(){

            if(isEmpty()){
                System.out.println("isEmpty");
                return -1;
            }
            return s1.pop();

        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("isEmpty");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String args[]){

        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.s1.isEmpty()){
            q.s1.peek();
        }
    }
    
}
