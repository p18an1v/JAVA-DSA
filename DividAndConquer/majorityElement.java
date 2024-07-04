package DividAndConquer;

public class majorityElement {

    //Divid and Conqure...
    static int comparingSection(int arr[], int n, int si, int ei){
        int count= 0;
        for(int i = si; i<ei;i++){
            if(arr[i]==n){
                count++;
            }
        }
        return count;
    }
    static int majorityCounter(int arr[],int si,int ei){

        //base condition
        if(si==ei){
            return arr[si];
        }

        int mid  = si+(ei-si)/2; // mid of array
        //divid
        int left = majorityCounter(arr, si, mid); // leftPivote
        int right = majorityCounter(arr, mid+1, ei); //rightPivote

        if(left == right){
            return left;
        }
        //conquer
        int leftCount = comparingSection(arr, left, si, mid);
        int rightCount = comparingSection(arr, right, mid, ei);
        

         return leftCount>rightCount ? left:right;
    }
   //end divid conqurer



    //Brute force approcah
    static int majorityElem(int arr[]){
        int majorityCounter = arr.length/2;
        for(int i = 0;i<arr.length;i++){
            int count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    count+=1;
                }
            }
            if(count>majorityCounter){
                return arr[i];
            }
        }
        return -1;
    }
 
    public static void main(String args[]){
        int arr[] = {1,1,2,2,1,2,2,2};


        System.out.println("Brut force");
        System.out.println(majorityElem(arr));


        System.out.println("Divid & Conqure");
        System.out.println(majorityCounter(arr, 0, arr.length-1));


    }
}
