package Backtracking;

public class NQueenCountSolution {
    
    //setting queens
    static boolean nqueen(char board[][],int row){
        //base condition
        if(row==board.length){
            //printBoard(board);
            // count++;
            return true;
        }

        //setting the queens
        for(int j=0;j<board.length;j++){
            if(isSafe(board, row,j)==true){
            board[row][j] = 'Q';
             if(nqueen(board, row+1))
             {
                   return true;
             } // recusive call
             board[row][j] = '.'; // backtrack call
            }
        }

        return false;
    }
    //printing
    static void printBoard(char board[][]){
        System.out.println("--------chess board---------");
        for(int i= 0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    //is Safe to set the queen in the board or not 
    static boolean isSafe(char board[][],int row,int col){

        //bootom to top or vertical top
        for(int i=row-1;i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }


        //diagonal to left 
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }


        //diagonal to right
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    static int count = 0;

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        //initization in stating board filled with 'X'
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = '.';
            }
        }

        //now setting the queens
        if(nqueen(board , 0)){
            System.err.println("solution is possible");
            printBoard(board);
        }else{
            System.out.println("solution is not possible");
        } // row is passed
        //System.out.println("Total ways to solution for n-queens is "+count);
    }
}
