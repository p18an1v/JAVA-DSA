public class transposOfarray {
 
     static void transpos(int arr[][],int row, int col){

        int transpoarr[][] = new int[col][row] ;


           for(int i = 0; i<row;i++){
             for(int j = 0; j<col; j++){
                transpoarr[j][i] = arr[i][j];
             }
             System.out.println();
           }   
           
           print(transpoarr);
     }

     static void print(int arr[][]){

       for(int i = 0; i<arr.length;i++){
             for(int j = 0; j<arr[0].length; j++){
              System.out.print(arr[i][j] + " ");
             }
             System.out.println();
           }       

     }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3},
                       {4,5,6}};
        int row  = 2, col = 3;               

        transpos(arr,row,col);               

                   
        

        //transpos(arr);
    }
}
