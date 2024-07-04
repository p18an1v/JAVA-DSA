package DividAndConquer;

public class QuickSort {

    static void sort(int arr[],int si,int ei){

         if(si>ei){
            return;
        }
        // find pivot - as a last element
        // aab pivot kay basis pr muje partition karna 
        int pIdx =  partition(arr,si,ei);     //pIdx is the index of pivot and  || pratition will give the index of 
        sort(arr, si, pIdx-1); //left
        sort(arr, pIdx+1, ei); //right
    }
    
     static int partition(int[] arr, int si, int ei) {
        int pivot = arr[ei];    
        int i = si-1; // to make place for els smaller than pivot

        for(int j=si;j<ei;j++){
            // sare elements ko check karun swap kayla ani 
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        //pivot la orignal place var aanla after every elemts anyalse and swap
        i++;
        int temp = pivot;
        arr[ei] = arr[i]; //pivot = arr[i];
        arr[i] = temp;
        return i;
    }

    static void print(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]  = {6,3,9,5,2,8};
        System.out.println("Before sorting ");
        print(arr);
        System.out.println(" After sorting ");
        sort(arr, 0, arr.length-1);
        print(arr);
    }
}
