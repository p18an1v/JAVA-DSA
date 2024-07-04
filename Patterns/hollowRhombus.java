
public class hollowRhombus {
    
    static void hollow(int n){

        for(int i = 1;i<=n;i++){

            //spaces
            for(int space = 1;space<=n-i;space++){
                System.out.print(" ");
            }
            //stars
            for(int j = 1;j<=n;j++){

                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow(5);
    }
}
