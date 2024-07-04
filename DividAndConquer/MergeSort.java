package DividAndConquer;
public class MergeSort {

    static void divid(int arr[], int si, int ei){

        int mid  = si+(ei-si)/2;
        if(si>=ei){
            return;
        }
        divid(arr, si, mid); //left
        divid(arr, mid+1, ei); //right
        merge(arr,si,ei,mid); //merge 
    }

    static void merge(int arr[],int si, int ei, int mid){

        int temp[] = new int[ei-si+1];
        int i = si; 
        int j = mid+1;
        int k = 0;

        while(i<=mid && j<=ei){ //compare and sort 
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //remaingin left 
        while(i<=mid){
            temp[k++]= arr[i++];
        }

        //remaining right
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        //temp is copying to the original array
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }

    }

    //Printing Function
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
        divid(arr, 0, arr.length-1);
        print(arr);
    }
    
}
