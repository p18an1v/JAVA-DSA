package LeetCode;

public class SlidingWindow {
    

    public static int solveBywindow(int nums[],int k){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i<k;i++){
            currSum+=nums[i];
        }
        
        maxSum = currSum;
        for(int i = k; i<nums.length-k;i++){

            currSum-=nums[i-k]; //remove the starting elements
            currSum += nums[i];// adding the new elements
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        
       // int nums[] = {1, 7, 6, 2, 3, 4, 5};
        int nums[] = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(solveBywindow(nums, k));
    }
}
