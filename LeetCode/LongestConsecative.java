package LeetCode;
import java.util.Arrays;

public class LongestConsecative {
    


    public static int findLongest(int nums[], int N){

        if (N == 0) return 0;
        
        Arrays.sort(nums);

        int longest = 1;

        int currentStreak = 1;

        for(int i = 1; i<nums.length;i++){

            if(nums[i]==nums[i-1]){
                continue;
            }

            if(nums[i]==nums[i-1]+1){
                currentStreak++;
            }else {
                // Reset current streak
                longest = Math.max(longest, currentStreak);
                currentStreak = 1;
            }
            longest = Math.max(longest, currentStreak);
        }
        return longest;

    }

    public static void main(String args[]){

        int nums[] = {33, 20, 34, 30, 35};
        int N = 5;
        System.out.println(findLongest(nums, N));
    }
}
