package Recurrsion;

public class SumOFNaturalNumber {
    
    static int Sum(int n){
       int sum;
        if(n==1){
            return 1;
        }
        sum = n + Sum(n-1);
        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
       System.out.println(Sum(n));
    }
}
