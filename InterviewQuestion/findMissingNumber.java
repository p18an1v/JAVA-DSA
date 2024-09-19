package InterviewQuestion;
 // Given an array nums of n integers where nums[i] is in the range [1, n], 
//return an array of  all the integers in the range [1, n] that do not appear in nums.
// Example 1:
// Input: nums = [4,3,2,7,8,2,3,1]
// Expected Output: [5,6]
public class findMissingNumber {

    public static void missNum(int nums[]){

        //sort
        for(int i = 0; i<nums.length;i++){

            while(nums[nums[i]-1] != nums[i]){
                int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;
            }
        }

        for(int i =0; i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }

        System.out.println();

        //check
        for(int i = 0; i<nums.length;i++){
            if(nums[i]!=i+1){
                System.out.print(i+1+" ");
            }
        }

    }
    
    public static void main(String args[]){

        int nums[] = {4,3,2,7,8,2,3,1};
        missNum(nums);
    }
}
