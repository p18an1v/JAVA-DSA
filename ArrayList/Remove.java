package ArrayList;

import java.util.ArrayList;

public class Remove {
     public static void main(String[] args) {

    ArrayList<Integer> ls = new ArrayList<>();
    ls.add(1);//0
    ls.add(2);//1
    ls.add(3);//2
    ls.add(4);//3

    ls.remove(1); // removing 1st index of the list
    System.out.println(ls);
    }
}
