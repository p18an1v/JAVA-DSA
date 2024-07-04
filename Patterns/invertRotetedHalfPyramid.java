
public class invertRotetedHalfPyramid {
    
    static void pyramid(int totalRow,int totalCol){

        //row
        for(int i=1;i<=totalRow;i++){

            // spaces
            for(int j =1;j<=totalCol-1;j++){
               System.out.print(" ");
            }

            // "*" print karnar 
            for(int  j =1; j<=i ;j++){
               System.out.print("*");
            }
            
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int totalRow = 4;
         int totalCol =4;
         pyramid(totalRow, totalCol);

    }
}
