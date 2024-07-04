package ArrayList;

import java.util.ArrayList;

public class mostWater {
    
    //Brute force - O(n^2)
    static int storeWater(ArrayList<Integer> ls){

        int max = 0;
        for(int i = 0; i<ls.size();i++){
            for(int j =i+1;j<ls.size();j++){
                int ht = Math.min(ls.get(i), ls.get(j));
                int width = j-i;
                int currWater = ht*width;
                max = Math.max(max, currWater);
            }
        }

        return max;
    }

    // 2 pointer 
    static int twoPoiter(ArrayList<Integer> hight){

        int maxwater = 0 ;
        int lp = 0;
        int rp = hight.size()-1;

         while (lp<rp) {
            //calculate 
            int ht = Math.min(hight.get(lp), hight.get(rp));
            int wd = rp-lp;
            int currWater = ht*wd;
            maxwater = Math.max(maxwater, currWater);

            //update 
            if(hight.get(lp)<hight.get(rp)){
                lp++;
            }else{
                rp--;
            }
         }
         return maxwater;

    }

    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(8);
        ls.add(6);
        ls.add(2);
        ls.add(5);
        ls.add(4);
        ls.add(8);
        ls.add(3);
        ls.add(7);

        System.out.println(storeWater(ls));
        System.out.println(twoPoiter(ls));
    }
}
