package ArrayList;
public class ThirdBiggestINArray {
    

    public static void main(String[] args) {
        int arr[] = {4,3,2,18,5};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){

                if(arr[i]>arr[j]){

                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j] = temp;

                }
            }
        }

        System.out.println(arr[arr.length-3]);
    }
}
