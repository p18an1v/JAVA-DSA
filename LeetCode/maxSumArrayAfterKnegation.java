package LeetCode;

import java.util.Arrays;

public class maxSumArrayAfterKnegation {
    

    //find minimums in the array
    //convert that in to -nums[i]
    //add sum
    public static int maxAfterKnegation(int nums[], int k){

        Arrays.sort(nums);
        for(int i = 0;i<nums.length && k>0;i++){
            if(nums[i]<0){
                nums[i] = -nums[i];
                k--;
            }
        }

        Arrays.sort(nums);
        if(k%2!=0){
            nums[0]=-nums[0];
        }
    

       
        int sum = 0;
        for(int i =0;i<nums.length;i++){
            sum+=nums[i];
        }

        return sum;
    }


    public static void main(String[] args) {
        int nums[] = {5,6,9,-3,3}; // -3 3 5 6 9
        int k = 2; 
        System.out.println(maxAfterKnegation(nums, k));
    }
}
