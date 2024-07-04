package Recurrsion;

public class poweProblemOptimize { //O(log n)

     static int optimzePower(int x,int n){
        
        if(n==0){
            return 1;
        }
        
        int halfPowerSqr = optimzePower(x, n/2) * optimzePower(x, n/2);

        //odd
        if(n%2!=0){
            halfPowerSqr = x*halfPowerSqr;
        } 
        return halfPowerSqr;
     }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(optimzePower(x, n));
    }
}
