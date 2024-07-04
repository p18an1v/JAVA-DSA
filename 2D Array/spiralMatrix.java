public class spiralMatrix {

    static void spiralPrint(int arr[][]){
        int strRow =0;
        int strCol =0;
        int endRow = arr.length-1; //limit
        int endCol = arr[0].length-1; //

        while (strRow<=endRow && strCol<=endCol) {

            //top
           for(int j = strCol ; j<=endCol;j++){
                 System.out.print(arr[strRow][j]+" ");
           }

            //right
           for(int j = strRow+1;j<=endRow;j++){
            System.out.print(arr[j][endCol]+" ");
           }

            //bottom 
            for(int j = endRow-1;j>=strCol;j--){
                if(strCol==endCol){
                    return;
                }
                System.out.print(arr[endRow][j]+" ");
            }

            //left
            for(int i =endRow-1 ; i>=strRow+1;i--){
                 System.out.print(arr[i][strCol]+" ");
                }

            strRow++;
            strCol++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[][] = { {1,2,3,4},
                         {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        spiralPrint(arr);
    }
    
}
