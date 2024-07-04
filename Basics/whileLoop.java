package Basics;
import java.util.Scanner;

public class whileLoop {
    
    public static void main(String[] args) {
        int counter = 0 ;
       /* while(counter<=10){
            System.out.println(counter);
            counter++;
        }*/ 
        int sum = 0;
        int i =1;
        System.out.println("enter the limit : ");
         Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();

        while (i<=n) {
            sum = sum+i;
            i++;
        }
        System.out.println("Sum is "+ sum);
    }
}
