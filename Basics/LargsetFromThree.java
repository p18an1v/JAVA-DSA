package Basics;
public class LargsetFromThree {
    public static void main(String[] args) {
        int a = 3;
        int b =2;
        int c =5;

        if(a>b && a>c){
            System.out.println("Lasgert is a = "+a);
        } else if(b>a && b>c){
            System.out.println("Lasgert is b  = "+b);
        } else{
            System.out.println("Lasgert is c = "+c);
        }
    }
}
