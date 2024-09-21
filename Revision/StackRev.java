package Revision;

import java.util.InputMismatchException;
import java.util.Scanner;

import Recurrsion.lenghtOfString;
import String.uppercase;

public class StackRev {
    
    //Stack is Fist in last out opration 
    // tower of books 

    //Stack can be created with 2 types 
    //1. array
    //2. linked list

    static int top ;
    static int size = 5;
    static int stack[] = new int[size];

    // initaily stack value is -1; so its initailzed by constructor
    StackRev(){
        top=-1;
    }

    //now checking stack is empty or not
    static boolean isEmpty(int top){
           if(top<0){
            System.out.println("Stack is Empty");
           }
           return (top<0);
    }


    public static void push(int data){
        
        if(top== stack.length-1){
            System.out.println("stack is overflow");
        }else{
            top++;
            stack[top] = data;
            System.out.println("Data is pushed"); 
        }
    }

    //print 
    public static void print(){
        for(int i = top ; i>=0 ;i--){
            System.out.print(stack[i]+" ");
        }
    }

    //peek
    public static void peek(int stack[]){
        System.out.println(stack[stack.length-1]);
    }

    public static void pop(int stack[]){

        if(top == -1){
            System.out.println("stack is empty");
        }
        else{

            top--;
            System.out.println("data is poped");
        }
    }
    public static void main(String args[]){

        
        //push pop peek
        System.out.print("Enter the data");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <=size; i++) {
            try {
                int n = sc.nextInt();
                push(n);
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                sc.next(); // Consume the invalid input
                i--; // Decrement the loop counter to re-enter the current iteration
            }
        }

        print();

        


    }
}
