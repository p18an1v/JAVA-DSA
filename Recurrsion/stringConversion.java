package Recurrsion;

public class stringConversion {

   static String digit[] = {"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
                           // 0      1     2      3      4       5     6      7       8       9     10
    static void printDigt(int number){
        if(number == 0){
            return;
        }

        int lastDigit = number%10;  //ghetla number la
        printDigt(number/10); // remove kela number la

        System.out.print(digit[lastDigit]+" ");
    }
    
    

    public static void main(String[] args) {
       printDigt(1942);
       
    }
}
