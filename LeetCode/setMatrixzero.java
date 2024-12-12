package LeetCode;
public class setMatrixzero {
    
    
    public static void setZeroes(int[][] matrix) {

        for(int i = 0; i<matrix.length;i++){

            for(int j = 0 ; j<matrix[0].length;j++){

                if(matrix[i][j]==0){
                    markRow(i,matrix);
                    markCol(j,matrix);
                }
            }
        }

        for(int i = 0; i<matrix.length;i++){

            for(int j = 0 ; j<matrix[0].length;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
            }
        
        }
    }

    public static void markRow(int i,int[][] matrix){
        for(int j = 0; j<matrix.length;j++){
            matrix[i][j]=-1;
        }
    }

    public static void markCol(int j,int[][] matrix){
        for(int i = 0; i<matrix.length;i++){
            matrix[i][j]=-1;
        }
    }


    public static void print(int[][] matrix){
        for(int i = 0; i<matrix.length;i++){

            for(int j = 0 ; j<matrix[0].length;j++){
                
                System.out.print(matrix[i][j]+" ");
              
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
      //  int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        
       System.out.println("previous matrix ");
       print(matrix);

       System.out.println("updated matrix ");
       setZeroes(matrix);
       print(matrix);
    }
}
