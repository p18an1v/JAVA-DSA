package LeetCode;

public class rotateImg {

    public static void  roated(int arr[][]){
        int row = arr.length;
        int col = arr[0].length;
        // int newRow = 0;
        // int newCol = 0;
        int newArr[][] = new int[row][col];

        // Rotating the matrix by 90 degrees clockwise
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                newArr[j][row - 1 - i] = arr[i][j];
            }
        }
        print(newArr);
    }

    public static void print(int arr[][]){
        int row = arr.length;
        int col = arr[0].length;
        
        for(int i = 0; i<row;i++){
            for(int j = 0; j<col ; j++){
                System.out.print(arr[i][j]+" ");
            }
           System.out.println();
        }
    }
    

    public static void main(String args[]){
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
       // print(arr);
       roated(arr);
    }
}
