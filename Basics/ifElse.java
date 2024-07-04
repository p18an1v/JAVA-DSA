package Basics;
import java.util.Scanner;
public class ifElse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age ");
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("You Can Drive, Your adult, You can vote now, You going to college ");
        }
        else{
            System.out.println("Your not adult, you are child");
        }
    }
}