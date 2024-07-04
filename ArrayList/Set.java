package ArrayList;

import java.util.ArrayList;

public class Set{
    public static void main(String[] args) {

        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(1);//0
        ls.add(2);//1
        ls.add(3);//2
        ls.add(4);//3
    
       ls.set(1, 5);
        System.out.println(ls);
        }
}
