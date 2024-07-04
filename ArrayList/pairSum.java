package ArrayList;

import java.util.ArrayList;

public class pairSum {
    

    public static void main(String[] args) {
        
        ArrayList<Integer> ls = new ArrayList<>();

        for(int i=0 ;i<5;i++){
            ls.add(i);
        }
        int target = 4;
        System.out.println(ls);

        //Brut force O(n^2)
        /*for(int i = 0; i<ls.size(); i++){
            for(int j= 1;j<ls.size();j++){
                if(ls.get(i)+ls.get(j)==target){
                    System.out.println(ls.get(i)+" "+ls.get(j));
                }
            }
        }
        */
        //2 pointer approach O(n)
        int lp =0;
        int rp = ls.size()-1;

        while(lp!=rp){ //lp!=rp

         if(ls.get(lp)+ls.get(rp)==target){
            System.out.println(ls.get(lp)+" "+ls.get(rp));
         }
         
        if(ls.get(lp)+ls.get(rp)<target){
            lp++;
         }else{
            rp--;
         }

        }

    }
}
