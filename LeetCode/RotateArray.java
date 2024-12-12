package LeetCode;
public class RotateArray {
    
    public static void revers(int nums[],int start,int end){

       while(start<end){
        int temp = nums[start];
        nums[start]  = nums[end];
        nums[end] = temp;
        start++;
        end--;
       }
    }

    public static void main(String args[]){

        int nums[] = {1,2,3,4,5,6,7};
        int k = 3;

        revers(nums, 0, nums.length-1);// revers total array [7.6.5.4.3.2.1]
        revers(nums, k, nums.length-1);

        for(int i = 0; i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }


    }
}
