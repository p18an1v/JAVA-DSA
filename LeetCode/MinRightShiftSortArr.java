package LeetCode;

public class MinRightShiftSortArr {
    

    public static int findMinRightShift(int nums[]){

        int pivot = -1;

        for(int i = 0; i<nums.length-1;i++){
            if(nums[i]>nums[i+1]) {
                pivot = i;
                break;
            }           
        }

        if(pivot == -1){
            return 0;
        }

        for(int i = pivot+1;i<nums.length-1;i++)
        {
            if (nums[i] > nums[i + 1]) {
                return -1;
            }
        }

        if (nums[nums.length - 1] > nums[0]) {
            return -1;
        }
        return nums.length-pivot-1;
    }

    public static void main(String[] args) {
        //int nums[] = {3,4,5,1,2}; //output = 1
        int nums[] = {1,3,5}; //output = 0
         // int nums[] = {2,1,4};  //output = -1
        System.out.println(findMinRightShift(nums));
    }
}
