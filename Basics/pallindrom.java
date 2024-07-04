package Basics;
public class pallindrom {
    
    public static void main(String[] args) {
        int n = 131;
        int sum = 0;
        int r ;
        while(n>0){
            r = n%10;
            sum = (sum*10)+r;
            n = n/10;
        }
        if(sum == n){
            System.out.println("is a pallindrome number");
        }
        
        System.out.println("number "+ sum);
    }
}
