package LeetCode;

public class findNUniqueElmSumUpToZero {
    

    public static void findArr(int n){


        int arr[] = new int[n];
        int sum = 0;

        for(int i = 0;i<n-1;i++){
            arr[i] = i+1;
            sum+=arr[i];
        }

        arr[n-1] = -1*sum;

        for(int elm : arr){
            System.out.print(elm+" ");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        findArr(n);
    }
}
