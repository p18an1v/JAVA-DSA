package Basics;
import java.util.Scanner;

public class positiveAndNegative {
    public static void main(String[] args) {
        System.out.println("Enter the Numbers : ");
        Scanner sc  = new Scanner(System.in);
        int  a = sc.nextInt();
        
        if(a>0){
             System.out.println(a +" is Positive Number");
        }else{
             System.out.println(a +" is Negative Number");
        }
    }
}
