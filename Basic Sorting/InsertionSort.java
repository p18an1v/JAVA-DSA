public class InsertionSort {

    public void  sort(int arr[]){

        for(int i = 0; i<arr.length;i++){

            int curr = arr[i];   
            int prv = i-1;

            while(prv>=0 && arr[prv]>curr){
                arr[prv+1] = arr[prv];
                prv--;
            }
            arr[prv+1] = curr;
        }

        for(int i = 0 ; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        
        int arr[] = {5,4,1,3,2};
        InsertionSort is  = new InsertionSort();
        is.sort(arr);

    }
}
