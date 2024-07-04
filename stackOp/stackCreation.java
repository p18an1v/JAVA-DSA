package stackOp;

import java.util.ArrayList;
import java.util.EmptyStackException;

import ArrayList.size;

public class stackCreation {

   static ArrayList<Integer> ls = new ArrayList<>();

    public static boolean isEmpty(){
        return ls.size()-1==0;
    }

    //push
    public void push(int data){
        ls.add(data);
    }

    //pop
    public int pop(){
        isEmpty();
        int top = ls.get(ls.size()-1);
        ls.remove(ls.size()-1);
        return top;
    }

    //peek
    public static int peek(){
        isEmpty();
        return ls.get(ls.size()-1);
    }


    public static void main(String[] args) {
        stackCreation s = new stackCreation();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while (!s.isEmpty()) {
            System.out.print(s.peek());
            s.pop(); // You may want to pop the element after printing if you intend to empty the stack
        }
        

    }
    
}