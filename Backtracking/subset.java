package Backtracking;

import String.string;

public class subset {
    
    static void stringSubset(String str, String ans, int i){
        //base condition 
        if(i == str.length()){
          if(ans.length() == 0){
            System.out.println("null");
          }else{
            System.out.println(ans);
        }
        return;
    }
        //yes 
        stringSubset(str, ans+str.charAt(i), i+1);
        //No
        stringSubset(str, ans, i+1);
    }

    public static void main(String args[]){
        String str  =  "abc";
        stringSubset(str, "", 0);
    }
}
