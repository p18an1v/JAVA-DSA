package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
public class sort {
    public static void main(String[] args) {
         ArrayList<Integer> ls = new ArrayList<>();
        ls.add(9);//0
        ls.add(8);//1
        ls.add(3);//2
        ls.add(4);//3

        Collections.sort(ls);
        System.out.println(ls);
        Collections.sort(ls,Collections.reverseOrder());
        System.out.println(ls);
    }
}
