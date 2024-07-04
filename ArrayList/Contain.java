package ArrayList;

import java.util.ArrayList;

public class Contain {
    public static void main(String[] args) {

        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(1);//0
        ls.add(2);//1
        ls.add(3);//2
        ls.add(4);//3
    
        // return the boolean value as a output
        System.out.println(ls.contains(5));
        }
}
