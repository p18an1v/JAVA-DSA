package LeetCode;

import java.util.HashSet;

import ArrayList.Set;

public class removeDuplicates {

    public static int remove(int nums[]){

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i<nums.length;i++){
            set.add(nums[i]);
        }

        return set.size();
    }
    
    public static void main(String args[]){

        int nums[] = {1,1,2};
        System.out.println(remove(nums));
    }
}
