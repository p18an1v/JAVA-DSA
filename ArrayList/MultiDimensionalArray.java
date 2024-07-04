package ArrayList;

import java.util.ArrayList;

public class MultiDimensionalArray {
    

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> ml = new ArrayList<>();

        ArrayList<Integer> ls1 = new ArrayList<>();
        ArrayList<Integer> ls2 = new ArrayList<>();
        ArrayList<Integer> ls3 = new ArrayList<>();
       

        for(int i = 1;i <=5;i++){
            ls1.add(i*1);
            ls2.add(i*2);
            ls3.add(i*3);
        }

        ml.add(ls1);
        ml.add(ls2);
        ml.add(ls3);

        
        for(int i =0 ; i<ml.size();i++){
            ArrayList<Integer> curr  = ml.get(i);
            for(int j = 0; j <curr.size();j++){
                System.out.print(curr.get(j)+" ");
            }
            System.out.println();
        }
            
    }
}
