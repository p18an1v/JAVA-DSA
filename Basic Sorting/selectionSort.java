
public class selectionSort {

    static void sort(int arr[])
    {
        for(int i = 0;i< arr.length-1;i++){
            int minPos = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){ // arr[minPos] < arr[j] maximum in reverse
                    minPos = j; //update minimum position to new minimum
                }
            }

            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i]=temp;
            
        }

        for(int i= 0; i< arr.length;i++){
            System.out.println(arr[i]);
             
         }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        sort(arr);
    }
    
}
