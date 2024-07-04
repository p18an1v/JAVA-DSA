package stackOp;

import java.util.Stack;

public class reverseStack {

    public static void pushatBottom(Stack<Integer> s,int data){

        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushatBottom(s, data);
        s.push(top);

    }
   
    public static void stackReverse(Stack<Integer> s){

        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        stackReverse(s);
        pushatBottom(s, top);

    }

    public static void println(Stack<Integer> s){
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        stackReverse(s);
        println(s);
       
    }
}
