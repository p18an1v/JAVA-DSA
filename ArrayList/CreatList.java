package ArrayList;

import java.util.ArrayList;

public class CreatList {
    
    public static void main(String[] args) {
       ArrayList<Integer>  ls = new ArrayList<>();

       //adding elements
       ls.add(1);
       ls.add(2);
       ls.add(3);
       ls.add(4); 
       ls.add(5);
       System.out.println(ls);
   
      int max = Integer.MIN_VALUE;

       for(int i = 0 ; i<ls.size();i++){
         if(max< ls.get(i)){
          max = ls.get(i);
         }
       }
       System.out.println(max);

      
     /*  for(int i = 0 ; i<ls.size();i++){
        for(int j =i+1;j<ls.size();j++){
           if(ls.get(i)>ls.get(j)){
             int a = ls.get(i);
             int b = ls.get(j);
             int temp = a;
             a = b;
             b=temp;
           }
        }
      }
      System.out.println(ls.get(ls.size()-1));*/
    }
}
