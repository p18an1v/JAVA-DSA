package LeetCode;

public class rotatedArrayByDplace {

    public static void roated(int nums[], int k){

        // int newArr[] = new int[nums.length];
        // int b = 0;

        // int revStart = nums.length-k;

        // for(int i = revStart;i<nums.length;i++){
        //     newArr[b] = nums[i];
        //     b++;
        // }

        // for(int j = 0;j<revStart;j++){
        //     newArr[b] = nums[j];
        //     b++;
        // }

        // for(int i = 0; i<newArr.length;i++){
        //     System.out.print(newArr[i]+" ");
        // }


          // first we revers the hole array
          int i = 0;
          int j = nums.length-1;
          k=k%nums.length;    // - this will insure it will not go out side

          revers(nums, i, j); // this will revers the hole array   [7,6,5,4,3,2,1]
          revers(nums,i,k-1); // this will revers the 0 to k-1 idx on already revers array [5,6,7,4,3,2,1]
          revers(nums,k,j); // this will revers the form k to j on remaining revers array  [5,6,7,1,2,3,4]

           for(int c = 0; c<nums.length;c++){
            System.out.print(nums[c]+" ");
        }
    }

    public static void revers(int nums[], int i, int j){
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        roated(nums, 3);

        

    }
}
