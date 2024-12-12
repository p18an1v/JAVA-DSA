package LeetCode;

import java.util.Arrays;

public class maxProductOfThreeNum {

    public static int maxProduct(int nums[]){
        

        int n = nums.length;
        Arrays.sort(nums);

        int max1 = nums[n-1]*nums[n-2]*nums[n-3];
        int max2 = nums[0]*nums[1]*nums[2];
        int max3 = nums[0]*nums[1]*nums[n-1];

        if(max1>max2 && max1>max3){
            return max1;
        }else if(max2>max1 && max2 > max3){
            return max2;
        }

        return max3;
    }

   
    
    public static void main(String[] args) {
        
        int nums[] = {-100,-98,-1,2,3,4};
        System.out.println(maxProduct(nums));
        

    }
}
