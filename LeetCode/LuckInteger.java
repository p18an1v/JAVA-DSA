package LeetCode;

import java.util.HashMap;

public class LuckInteger {
    

    public static int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length;

        for(int num : arr){
           map.put(num, map.getOrDefault(num, 0)+1);
        }

        map.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        });
        
        int luckyNumber = -1;

        // Check for lucky numbers
        for (int key : map.keySet()) {
            if (key == map.get(key)) {
                luckyNumber = Math.max(luckyNumber, key);
            }
        }

        return luckyNumber;
    }

    public static void main(String args[]){

        int arr[] = {2,2,2,3,3};
       // findLucky(arr);
        System.out.println(findLucky(arr));
    }
}
