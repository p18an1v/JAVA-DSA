public class diagonalSum {

    static int Dsum(int arr[][]){ //O(n^2)
        int sum=0;
        for(int i = 0 ;i<=arr.length-1;i++)
        {
            for(int j =0 ;j<=arr[0].length-1;j++)
            {
                if(i==j)
                {
                 sum+=arr[i][j];
                }
                else if(i+j == arr.length-1)
                {
                    sum = sum+arr[i][j];
                }
            }
        }
    return sum; 
    }

    static int optimizeCode(int arr[][]){
        int sum=0;
        for(int i = 0;i<arr.length;i++){
            //pd
             sum += arr[i][i];

             //sd
             if(i != arr.length-1-i){
             sum += arr[i][arr.length-i-1];
             }
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[][] = { {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        System.out.println(Dsum(arr));
        System.out.println(optimizeCode(arr));
    }
    
} 