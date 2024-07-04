import java.util.Scanner;

public class TwoDarray {
    
    static void printFunction(int arr[][],int n, int m){
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }

     static void InputFunction(int arr[][],int n, int m){
        Scanner sc =new Scanner(System.in);
        for(int i =0;i<n;i++){ 
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }

     static void SearchFunction(int arr[][],int n, int m,int key){
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==key){
                    System.out.println(key+ " Key Found at "+i+" , "+j+" places" );
                }
            }
        }
    }

     static int LargestFunction(int arr[][],int n, int m){
        int samllest = Integer.MAX_VALUE; // most +value +infinity
        int largest = Integer.MIN_VALUE; //most -value -infinity
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){

                if(largest<arr[i][j]){
                    largest = arr[i][j];
                }
            }
        }
        return largest;
    }

    static int SamllestFunction(int arr[][],int n, int m){
        int samllest = Integer.MAX_VALUE; // most +value +infinity
        int largest = Integer.MIN_VALUE; //most -value -infinity
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){

                if(samllest>arr[i][j]){
                    samllest = arr[i][j];
                }
            }
        }
        return samllest;
    }

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
        int n=4,m=3;
        int arr[][] = new int[n][m];
        System.out.println("Enter the numbers in the array : ");
        InputFunction(arr, n, m);
        System.out.println("Printing the numbers from the array: ");
        printFunction(arr, n, m);
        System.out.println("Enter the key to find in the array : ");
         Scanner sc =new Scanner(System.in);
        int key = sc.nextInt();
        SearchFunction(arr, n, m,key);
        System.out.println("Finding Largest in the array : "+ LargestFunction(arr, n, m));
        System.out.println("Finding Smallest in the array : "+ SamllestFunction(arr, n, m));
        spiralPrint(arr);


    }
}
