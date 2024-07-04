public class printSumOFSecondRow {

    static int sum(int arr[][]){

       int sum = 0;
       int k =1;

       for(int j =0; j<arr[0].length;j++){
          sum += arr[k][j];
       }

        return sum;
    }
    
    public static void main(String[] args) {
        int arr[][] = {
            {1,4,9},
            {11,4,3},
            {2,2,3}
        };
        System.out.println(arr.length+","+arr[0].length);
        System.out.println("sum "+sum(arr));
    }
}
