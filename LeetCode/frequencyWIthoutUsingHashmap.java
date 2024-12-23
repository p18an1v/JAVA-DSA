package LeetCode;


public class frequencyWIthoutUsingHashmap {
    
    public static void narr(int nums[]){
        int cnt[] = new int[6];
        for(int i =0 ;i<nums.length;i++){
            cnt[nums[i]]++;
        }
        

        for(int elm :cnt){
            System.out.print(elm+" ");
        }
    }

    public static void main(String[] args) {
        int nums[] = {2, 1, 2, 5, 3, 2};
        narr(nums);
        
    }
}
