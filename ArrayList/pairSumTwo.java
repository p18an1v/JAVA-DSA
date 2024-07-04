package ArrayList;

import java.util.ArrayList;

public class pairSumTwo {
    
    static boolean pairSum( ArrayList<Integer> ls , int target){

        int n = ls.size();
        int bp = -1;
        for(int i = 0; i<ls.size();i++){
            if(ls.get(i)>ls.get(i+1)){
                //braking point
                bp =i;
                break;
            }
        }

        int lp = bp+1; //smallest
        int rp = bp; //largest

        while (lp!=rp) {
            //case 1
            if(ls.get(lp)+ls.get(rp)==target){
              
                return true;
            }
            if(ls.get(lp)+ls.get(rp)<target){
                 lp= (lp+1)%n;

            }else{
                rp = (n+rp-1)%n; 
            }
        }
        return false;
    }

    public static void main(String args[]){

        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(11);
        ls.add(15);
        ls.add(6);
        ls.add(8);
        ls.add(9);
        ls.add(10);
        int target =16;
        System.out.println(pairSum(ls, target));
    }
}
