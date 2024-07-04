package Basics;
import java.util.Scanner;
public class printEvenOdd {
    
    public static void main(String[] args) {
        
        System.out.println("Enter the Number : " );
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("Number is  even " + num);
        }
        else {
            System.out.println("Number is  odd " + num);
        }
    }
}
