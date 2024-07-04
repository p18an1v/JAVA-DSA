package RecursionBasicQuestion;

public class maxElementArray {
    
    static int maxEl(int arr[], int si, int ei){
        if(si==ei){
            return arr[si];
        }
        int mid  = (si+ei)/2;
       int Left =  maxEl(arr, si, mid); //left
       int right =  maxEl(arr, mid+1, ei); //right

       return Math.max(Left, right);
    }


    public static void main(String[] args) {
        int arr[]  = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(maxEl(arr, 0, arr.length-1));
    }
}
