package Basics;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two Numbers : ");
        int  num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum;
        System.out.println("Enter the opration u want to perfrom");
        char op = sc.next().charAt(0);

        switch(op){
            case '+':
            sum = num1+num2;
            System.out.println("sum of the number is :"+ sum);
            break;

             case '-':
            sum = num1-num2;
            System.out.println("sum of the number is :"+ sum);
            break;

             case '*':
            sum = num1*num2;
            System.out.println("sum of the number is :"+ sum);
            break;

             case '/':
            sum = (int)(num1/num2);
            System.out.println("sum of the number is :"+ sum);
            break;

             case '%':
            sum = num1%num2;
            System.out.println("sum of the number is :"+ sum);
            break;


        }
    }
}
