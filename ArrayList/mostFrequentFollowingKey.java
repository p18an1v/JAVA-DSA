package ArrayList;

import java.util.ArrayList;

public class mostFrequentFollowingKey {

    static int followingKey(ArrayList<Integer> ls, int key) {
        int[] result = new int[1000]; // store the frequency

        for (int i = 0; i < ls.size(); i++) {
            if (ls.get(i) == key) {
                result[ls.get(i + 1) - 1]++; //increse the count
            }
        }

        //finding the max
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for (int i = 0; i < 1000; i++) {
            if (result[i] > max) {
                max = result[i];
                ans = i + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<>();

        ls.add(1);
        ls.add(100);
        ls.add(1);
        ls.add(200);
        ls.add(100);
       System.out.println( followingKey(ls, 1));

    }
}
