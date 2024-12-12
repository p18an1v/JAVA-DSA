package LeetCode;

import java.util.*;

import example.arrListMonotonic;
class twoSum{

    //BRUTE FORCE APPROACH O(N^2)
  
public static int[] found(int nums[], int target) {
    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) { // Start from i + 1
            if (nums[i] + nums[j] == target) {
                return new int[] { nums[i], nums[j] }; // Return the pair immediately
            }
        }
    }
    return new int[] {}; // Return an empty array if no pair is found
}

//new approcah
public static int[] newapp(int nums[],int target){

    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i = 0; i<nums.length;i++){
        int c = target - nums[i];
        if(map.containsKey(c)){
            return new int[]{c,nums[i]};
        }
        map.put(nums[i],i);
    }
    return new int[]{};
}


    public static void main(String args[]){

        int nums[] = {2,7,11,15};
        int target  = 9;

        int newNum[] = newapp(nums, target);
        for(int i = 0; i<newNum.length;i++){
            System.out.println(newNum[i]);
        }
    }
}