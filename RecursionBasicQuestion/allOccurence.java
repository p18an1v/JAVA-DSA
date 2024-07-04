package RecursionBasicQuestion;

public class allOccurence {

    static void findAllKeyIdx(int arr[],int key,int i){
        //base case
        if(i ==arr.length){
            return;
        }

        if(arr[i]==key){
            System.out.print(i+" ");
        }
        findAllKeyIdx(arr, key, i+1);
    }
    
    public static void main(String args[]){

        int arr[] = {3,2,4,5,6,2,7,2,2};
        int key  = 2;
        findAllKeyIdx(arr, key, 0);
        
    }
}