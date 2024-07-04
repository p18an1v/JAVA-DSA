package Basics;
public class printRevers {
    
    public static void main(String[] args) {
       int n = 10899;
       int rev = 0;
       int lastDegit;

       int counter =0;
       while(n>0){

          lastDegit = n%10; //get last digit 
           rev = (rev *10) + lastDegit; // add last gegit 
           n=n/10; //remove last digit or update the last digit
         
       }
       System.out.println(rev);
    }
}
