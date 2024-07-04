public class printCountOfSeven {
    

    public static void countNum(int arr[][],int key){

        int count  = 0;
        for(int i = 0; i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                if(arr[i][j]==key){
                    count++;
                  
                }
            }
        }
       System.out.println(count);
    }
    public static void main(String args[]){

        int arr[][] ={{4,7,8},{8,8,7}};
        int key = 7;
       countNum(arr, key);

    }
}
