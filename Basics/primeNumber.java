package Basics;
import java.util.Scanner;

public class primeNumber {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int n = sc.nextInt();

        boolean isPrime = true;

        if(n==2){
            System.err.println("n is a prime number ");
        }
        else{
          for(int i = 2; i<Math.sqrt(n);i++){
           if(n%10==0){
            isPrime=false;
           }
        }

        if(isPrime==true){
            System.out.println(n+" is a Prime Number");
        }
        else{
             System.out.println(n+" Not a Prime Number");
        }
        }
        

    }
}
