public class PalindromPatternPyramid {
    
    static void pyramid(int n){

        for(int i = 1;i<=n;i++){

            //spcaes
            for(int space = 1; space <=n-i;space++){
                System.out.print(" ");
            }

            //desending
            for(int j=i;j>=1;j--){
                  System.out.print(j);
            }

            //asending
            for(int j = 2;j<=i;j++){
                  System.out.print(j);
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
         pyramid(5);
        }

}
