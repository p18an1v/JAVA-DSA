package DividAndConquer;

public class RotatedSearch {
    
    static int search(int arr[],int si,int ei,int key){
        int mid = si+(ei-si)/2;
        //base case
       if(si>ei){
        return-1;
       }
        //kaam
        if(arr[mid]==key){
            System.out.println("Key found at middle of the array");
            return mid;
        }
        // on mid line L1
        if(arr[si]<=arr[mid]){
            //case a : left
          if(arr[si]<=key && key<=arr[mid]){
           return search(arr,si,mid-1,key);
          }
          else{
             //case b : Right
            return search(arr, mid+1, ei, key);
          }
        }

        //on mid line l2
        if(arr[key]>=arr[mid]){
             //case a : left
          if(arr[mid]<=key && key<=arr[ei]){
            search(arr,mid+1,ei,key);
          }
          else{
             //case b : Right
            return search(arr, si, mid-1, key);
          }
        }
        return arr[key];
    }

    static void print(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int si = 0;
        int ei = arr.length-1;
        int key = 0;
        print(arr);
        int keyIdx = search(arr, si, ei, key);
        System.out.println("key fount at the index of ");
        System.out.println(keyIdx);
    }
}
