package Basics;
import java.util.Scanner;
public class switchCase {
    public static void main(String[] args) {
        System.out.println("1.Samosa 2.Burger 3.Mango Shake ");
        System.out.println("Enter your choic from Menue : ");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();

        switch(ch){
            case 1: 
                System.out.println("ur choic is Samosa");
                break;
            case 2:   
                System.out.println("ur choic is Burger");
                break; 
            case 3:
                System.out.println("ur choic is Mango Milk Shake");
                break;
            default:
                 System.out.println("wake up to the reality in this  cruesd  pian world ");
                break;        
        }
    }
}
