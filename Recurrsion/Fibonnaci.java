package Recurrsion;

public class Fibonnaci {
    
    static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int prev = fib(n-1);
        int front = fib(n-2);
        int sum = prev + front;
        return sum;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fib(n));
    }

}
