package stackRev;

import java.util.ArrayList;

public class stackB {
    

    static class stack{

      static   ArrayList<Integer> list = new ArrayList<>();

      // check is empty or not
        static boolean isEmpty(){
            return list.size()==0;
        }

        // push
        static void push(int data){
            list.add(data);
        }

        //pop
        static int pop(){

            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek
        static int peek(){
            return list.get(list.size()-1);
        }
    }

    public static void main(String[] args) {
            
        stack s= new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        //printing data and pop
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
