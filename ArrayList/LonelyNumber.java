package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class LonelyNumber {

    static ArrayList<Integer> findLonely(ArrayList<Integer> ls) {
        /*
         * //checking size of the elements
         * if(ls.size()<3){
         * return ls2;
         * }
         * 
         * Collections.sort(ls);
         * 
         * //checking the first elements
         * if(ls.get(1)>=ls.get(0)){
         * ls2.add(ls.get(0));
         * }
         * 
         * //check the middle elemtnts
         * for(int i=1;i<ls.size()-1;i++){
         * if(ls.get(i)>ls.get(i-1) && ls.get(i)<ls.get(i+1)){
         * ls2.add(ls.get(i));
         * }
         * }
         * 
         * // Check the last element
         * if (ls.get(ls.size() - 1) > ls.get(ls.size() - 2)) {
         * ls2.add(ls.get(ls.size() - 1));
         * }
         */

        Collections.sort(ls);
        ArrayList<Integer> list = new ArrayList<>();
        //middle elements
        for (int i = 1; i < ls.size() - 1; i++) {
            if (ls.get(i - 1) + 1 < ls.get(i) && ls.get(i) + 1 < ls.get(i + 1)) {
                list.add(ls.get(i));
            }
        }
        //size check keli
        if (ls.size() == 1) {
            list.add(ls.get(0));
        }

        //if size is bigger then 1
        if (ls.size() > 1) {
            //checking first elements
            if (ls.get(0) + 1 < ls.get(1)) {
                list.add(ls.get(0));
            }

            //checking last elements
            if (ls.get(ls.size() - 2) + 1 < ls.get(ls.size() - 1)) {
                list.add(ls.get(ls.size()-1));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<>();

        ls.add(10);
        ls.add(6);
        ls.add(5);
        ls.add(8);
        System.out.println(findLonely(ls));
        
    }

}
