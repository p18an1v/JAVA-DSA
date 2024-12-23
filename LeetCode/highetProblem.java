package LeetCode;

import java.util.Arrays;

public class highetProblem {
    

    public static int cheackHight(int nums[]){


        int sortedArr[] = nums.clone();
        Arrays.sort(nums);
        int cnt = 0;
        for(int i = 0;i<nums.length;i++){
            if(sortedArr[i]!=nums[i]){
                cnt++;
            }
        }
        return cnt;
    }


    public static void main(String[] args) {
        
        int nums[] = {2,1,2,1,1,2,2,1};
        System.out.println(cheackHight(nums));
    }
}
