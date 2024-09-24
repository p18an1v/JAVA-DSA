package Stack;

import java.util.InputMismatchException;
import java.util.Scanner;

public class stackBase {

    static int top;
    static int maxSize = 5;
    static int stack[] = new int[maxSize];

    // stack value is -1; constrictor to initalse the stack
    stackBase() {
        top = -1;
    }

    // check it is empty or not
    static boolean isEmpty() {
        return (top < 0);
    }

    // pop
    static void pop() {
        if (top == -1) {
            System.out.println("isEmpty");
        } else {
            top--;
            System.out.println("data poped");
        }
    }

    // push
    static void push(int data) {
        if (top == stack.length-1) {
            System.out.println("Overflow");
        } else {
            top++;
            stack[top] = data;
            System.out.println("data pushed");
        }
    }

    static void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    // peek
    static void peek() {
        System.out.println(stack[stack.length - 1]);
    }

    public static void main(String args[]) {
        System.out.print("Enter the data");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <=maxSize; i++) {
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
