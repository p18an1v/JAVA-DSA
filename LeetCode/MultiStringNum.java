package LeetCode;



import java.util.ArrayList;

// Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

// Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

 

// Example 1:

// Input: num1 = "2", num2 = "3"
// Output: "6"
// Example 2:

// Input: num1 = "123", num2 = "456"
// Output: "56088"
 
public class MultiStringNum {
    

    public static void main(String args[]){
        String num1= "123";
        String num2= "456";

        char num1Arr[] = new char[num1.length()];
        char num2Arr[] = new char[num2.length()];
        ArrayList<Character> arr = new ArrayList<>();

        for(int i = 0;i<num1.length();i++){
            num1Arr[i] = num1.charAt(i);
        }

        for(int i = 0;i<num2.length();i++){
            num2Arr[i] = num2.charAt(i);
        }

        
    }
}
