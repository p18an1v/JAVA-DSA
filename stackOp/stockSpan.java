package stackOp;

import java.util.Stack;

public class stockSpan {


    public static void sp(int stocks[], int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for(int i =1; i<stocks.length;i++){ // for every days
            int currPrice = stocks[i];
            while (!s.isEmpty() && currPrice>stocks[s.peek()]) { // check the price for previous
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }
            else{
                int prevHight =s.peek();
                span[i] = i - prevHight;
            }

            s.push(i);
        }

    }
    
    public static void main(String[] args) {
        int stocks[] = {100,80,60,70,60,85,100};
        int span[] = new int[stocks.length];
        sp(stocks,span);
        for(int i = 0; i<stocks.length;i++){
            System.out.print(span[i]+" ");
        }

    }
}
