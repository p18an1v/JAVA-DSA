import java.util.*;
public class stackUsingDeque {

    static class stack{
        Deque<Integer> d = new LinkedList<>();

        public void add(int data){
            d.addLast(data);
        }

        public int remove(){
            return d.removeFirst();
        }

        public int peek(){
            return d.getLast();
        }
    }

    public static void main(String args[]){

        stack s = new stack();
        s.add(1);
        s.add(2);
        s.add(3);
        System.out.println(s.peek());
        System.out.println(s.remove());
        System.out.println(s.remove());
        System.out.println(s.remove());
    }
    
}
