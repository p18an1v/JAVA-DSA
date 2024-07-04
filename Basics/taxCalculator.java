package Basics;
import java.util.Scanner;
public class taxCalculator {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tax;
        System.out.println("Enter your Income : ");
        int income = sc.nextInt();

        if(income<50000){
            System.out.println("your applied tax is zero ");
        }
        else if(income>50000 && income<100000){
            System.out.println("your applied tax is 20% ");
             tax  =(int)(income*(0.2));
            System.out.println("Your tax on your income is " + tax);
        }
        else{
             System.out.println("your applied tax is 30% ");
             tax  =(int)(income*(0.3));
            System.out.println("Your tax on your income is " + tax);
        }
        }
    }
