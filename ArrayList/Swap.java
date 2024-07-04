package ArrayList;

import java.util.ArrayList;

public class Swap {
    
    static void swapFun(ArrayList<Integer> ls, int idx1,int idx2){
        int temp = ls.get(idx1);
        ls.set(idx1, ls.get(idx2));
        ls.set(idx2,temp);
    }

    public static void main(String[] args) {
         ArrayList<Integer> ls = new ArrayList<>();
        ls.add(1);//0
        ls.add(2);//1
        ls.add(3);//2
        ls.add(4);//3

        System.out.println(ls);
        System.out.println("after swaping ");
        swapFun(ls, 1, 3);
        System.out.println(ls);
    }
}
