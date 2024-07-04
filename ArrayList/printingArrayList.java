package ArrayList;

import java.util.ArrayList;

public class printingArrayList {
    
    public static void main(String[] args) {

        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(1);//0
        ls.add(2);//1
        ls.add(3);//2
        ls.add(4);//3
    
         for(int i = 0; i<ls.size();i++){
            System.out.print(ls.get(i)+" ");
         }

         //in reverse 
          for(int i =ls.size()-1; i>=0;i--){
            System.out.print(ls.get(i)+" ");
         }


        }
}
