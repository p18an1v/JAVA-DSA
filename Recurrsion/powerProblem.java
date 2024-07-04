package Recurrsion;

public class powerProblem { // O(n)
    
     static int power(int x, int n){

        if(n == 0){
            return 1;
        }
        int p = power(x, n-1);
        int ans = x*p;
        return ans;
     }
    public static void main(String[] args) {
        int x =2;
        int n =5;
        System.out.println(power(x, n));
    }
}
