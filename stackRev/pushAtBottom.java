package stackRev;

import java.util.Stack;

public class pushAtBottom {
  static  Stack<Integer> s = new Stack<>();
  static void pushBottom(Stack<Integer> s,int data){

    if(s.isEmpty()){
        s.push(data);
        return;
    }

    int top = s.pop();
    pushBottom(s, data);
    s.push(top);
  }

    public static void main(String[] args) {
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        pushBottom(s, 5);
        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

}
