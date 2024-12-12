package LeetCode;

public class slidingWindow2 {

    public static double solve(int nums[],int k){

        int sum = 0;
        for(int i =0; i<k;i++){
            sum+=nums[i];
        }
        int max =sum;

        for(int i = k; i<nums.length;i++){

            sum += nums[i] - nums[i-k];
            max = Math.max(max, sum);
        }
        return (double)max/k;
    }
    

    public static void main(String[] args) {
        
        int nums[] = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(solve(nums, k));
    }
}
