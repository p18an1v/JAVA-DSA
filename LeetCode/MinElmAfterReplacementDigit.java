package LeetCode;

public class MinElmAfterReplacementDigit {
    

    public static int findMin(int nums[]){

        int min = Integer.MAX_VALUE;

       for(int num : nums){
        int sum = findSum(num);
        if(sum<min){
            min  = sum;
        }
       }
        
        return min;
        
    }

    public static int findSum(int val){
        int sum = 0;
        while(val>0){
            int r = val%10;
            sum+=r;
            val/=10;
        }
        return sum;
    }



    public static void main(String[] args) {

        int nums[] = {99,77,33,66,55};
        System.out.println(findMin(nums));
    }
}
