public class printNumsIn2dArray {
    
    static int searchNums(int arr[][],int key){

        int count = 0;
        for(int i = 0 ; i< arr.length;i++){
            for(int j = 0 ;j< arr[0].length; j++){
                if(key == arr[i][j]){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[][] = {{4,7,8},
                       {8,8,7}};
        int key  =7;
       System.out.println("how many 7s are there " + searchNums(arr, key));
    }
}
