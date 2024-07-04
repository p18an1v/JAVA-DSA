public class stairCaseSearch {

    static boolean serachFromTopRight(int arr[][],int key){

        int row  = 0, col = arr[0].length-1;
        while(row<arr.length && col>=0){

            if(arr[row][col]== key){
                System.out.println("Found key at "+ row +","+ col);
                return true;
            }else if(key < arr[row][col]){  // top right corner 
                col--;
            }else{
                row++;
            }
        }
        System.out.println("Key not found in the 2d array ");

        return false;
    }

    static boolean serachFromBottomLeft(int arr[][],int key){

        int row  = arr.length-1, col = 0;
        while(row>=0 && col<arr[0].length-1){

            if(arr[row][col]== key){
                System.out.println("Found key at "+ row +","+ col);
                return true;
            }else if(key > arr[row][col]){  // top right corner 
                col++;
            }else{
                 row--;
            }
        }
        System.out.println("Key not found in the 2d array ");

        return false;
    }
    

    public static void main(String[] args) {
        int arr[][] = { {10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        int key = 33;
        System.out.println(serachFromBottomLeft(arr, key));
        System.out.println(serachFromTopRight(arr, key));

    }
}
