package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class isomorphicString {


    public static boolean isIsomorphic(String s, String t){

        if(s.length()!=t.length()){
            return false;
        }

        Map<Character,Character> mp = new HashMap<>();

        for(int i = 0; i<s.length();i++){

            char a = s.charAt(i);
            char b = t.charAt(i);

            if(mp.containsKey(a)){
                if(mp.get(a)!=b){
                    //mp.get will return key value contains
                    return false;
                }
            }else{

                if(mp.containsValue(b)){
                    //this will check value is present in the map
                    return false;
                }

                mp.put(a,b);
            }
        }
        return true;
    }
    
    public static void main(String args[]){

        String s = "egg", t = "add";
       boolean a =  isIsomorphic(s, t);
       System.out.println(a);
    }
}
