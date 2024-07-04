package Basics;
import java.util.Scanner;

public class againInput {

    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter the number :");
            n = sc.nextInt();
            if(n%10==0){
                break;
            }
        }while(true);
    }
    
}
