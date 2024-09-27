package example;
public class sortStringArrayLinear {

    // Linear Approach


    //swap funtion
    static void swap(String arr[],int i){
        String temp = arr[i];
            arr[i]= arr[i+1];
            arr[i+1] = temp;
    }
    //print
    static void printFun(String arr[]){
        for(int i= 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
 // approach linear sorth
    public static void main(String[] args) {
        String arr[] = {"sun","earth","mars","marcury"};
        int n = arr.length;
        int j =0;
        for(int i = 0 ;i<n-1;i++){
            
          if(arr[i].charAt(j) > arr[i+1].charAt(j)){
            //swap
            swap(arr, i);
            

           }else if(arr[i].charAt(j) == arr[i+1].charAt(j)){
             if(arr[i].charAt(j+1) > arr[i+1].charAt(j+1)){
                //swap
                swap(arr, i);
             }
           }
        }
        //printing 
        printFun(arr);
        
    }
}
