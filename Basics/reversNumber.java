package Basics;
public class reversNumber {
    public static void main(String[] args) {
        int n =10899;
        while(n>0){
            int lastDegit = n%10;
            System.out.print(lastDegit+" ");
            n=n/10;
        }
    }
}
