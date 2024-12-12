package LeetCode;
import Recurrsion.removeDuplicate;

public class longestSubArrayWithSum {



    public static int longestSub(int nums[], int sum){
        int maxLength = 0;
        for(int i = 0; i<nums.length;i++){
           
            int total = 0;
            for(int j =i; j<nums.length;j++){
              
                total += nums[j];

                if(total==sum){
                    maxLength = Math.max(maxLength,j-i+1);
                }
                
            }
           
        }
        return maxLength;
    }


    public static void subArr(int nums[],int k){

        int maxLength = 0;

        for(int i = 0; i<nums.length;i++){
            int sum = 0;
            for(int j = i;j<nums.length;j++){
                sum+=nums[j];
                System.out.print(nums[j]+" ");
                System.out.print("-> "+sum+"|");

                if(sum==k){
                    maxLength = Math.max(maxLength,j-i+1);
                }
            }
            System.out.println();
        }
        System.out.println("sublength "+maxLength);
    }
    
    public static void main(String args[]){
        int nums[] = {10, 5, 2, 7, 1, 9};
        int sum = 15;
        //System.out.println(longestSub(nums, sum));
        subArr(nums,sum);
    }
}
