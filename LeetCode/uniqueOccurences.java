package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class uniqueOccurences {
    

    
    public static boolean check(int arr[]){
        int n = arr.length;

        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int elm : arr){
            if(map.containsKey(elm)){
                map.put(elm, map.get(elm)+1);
            }else{
            map.put(elm, 1);
            }
        }

        for(int i = 0;i<arr.length;i++){

            if(map.get(arr[i])==map.get(arr[i+1])){
                return false;
            }
            
        }

        
        return true;
    }

    public static void main(String args[]){

        int arr[] = {1,2};
        System.out.println(check(arr));
    }
}
