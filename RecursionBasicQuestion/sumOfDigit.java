package RecursionBasicQuestion;

import Recurrsion.lastOccurence;

public class sumOfDigit {
    
    static int sum(int num){
         if(num==0){
            return 0;
         }
            return (num % 10 + sum(num / 10));
         
    } 

    public static void main(String[] args) {
        int num = 239;
        int s = sum(num);
        System.out.println(s);

    }
}
