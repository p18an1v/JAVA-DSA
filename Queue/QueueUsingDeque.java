import java.util.Deque;
import java.util.LinkedList;

import RecursionBasicQuestion.sumOfDigit;

public class QueueUsingDeque {

    static class Queue{

        Deque<Integer> d = new LinkedList<>();

        //opration - addlast , romvefirst , getfirst

        public void addLast(int data){
            d.addLast(data);
        }

        public int removeFirst(){
            return d.removeFirst();
        }

        public int peek(){
            return d.peekFirst();
        }

    }
    

    public static void main(String args[]){

        Queue q = new Queue();
        q.addLast(1);
        q.addLast(2);
        q.addLast(3);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.removeFirst());
        System.out.println(q.removeFirst());
        System.out.println(q.removeFirst());

    }
}
