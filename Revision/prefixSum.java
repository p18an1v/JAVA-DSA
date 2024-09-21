package Revision;
public class prefixSum{

    public static int findPrefixMax(int nums[]){

        int count = 0;
        int maxSum = 0;
        for(int i =0; i<nums.length;i++){
            count+=nums[i];

            if(count<0){
                count=0;
            }
            
        }
        return count;
    }


    public static void main(String[] args) {

        // by using kadens algorithm
        int nums[] = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(findPrefixMax(nums));
    }

}
