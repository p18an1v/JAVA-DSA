import java.util.*;

public class QueueReversal {
    
    public static void revers(Queue<Integer> q){

        Stack<Integer> helper = new Stack<>();
        while(!q.isEmpty()){
            helper.push(q.remove());
        }

        while(!helper.isEmpty()){
            q.add(helper.pop());
        }
    }

    public static void main(String args[]){

        Queue<Integer> q = new LinkedList<>();

        for(int i = 1; i<=5;i++){
            q.add(i);
        }

        revers(q);

        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
