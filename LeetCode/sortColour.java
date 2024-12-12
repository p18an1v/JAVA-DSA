package LeetCode;
import java.util.HashMap;

public class sortColour {
    
    public static void sort(int[] nums) {
        int low  = 0;
        int mid = 0;
        int high = nums.length-1;

        while(mid<=high){

            if(nums[mid]==0){
                //swap low and mid
                swap(nums,low,mid);
                low++;
                mid++;
            }else if(nums[mid]==1){
                //no swaping
                mid++;
            }
            else{
                //swap mid and high
                swap(nums,mid,high);
                high--;
            }

        }
    }

    public static void swap(int nums[], int i,int j){

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }


    public static void sortWithFrequenc(int nums[]) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        
    }

    public static void main(String args[]){

        int nums[] = {2,0,2,1,1,0};
        sort(nums);
        
    }
}
