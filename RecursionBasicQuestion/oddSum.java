package RecursionBasicQuestion;

public class oddSum {
    
    static int sum(int arr[],int idx){

        if(idx==arr.length){
            return 0;
        }
        int res =  sum(arr, idx+1);
        if(arr[idx]%2!=0){
            res +=arr[idx];
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,8,9};
        System.out.println(sum(arr, 0));
    }
}
