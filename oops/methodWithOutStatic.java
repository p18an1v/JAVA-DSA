import java.util.Scanner;

public class methodWithOutStatic {
     public void findEven(int a){
        if(a%2==0){
            System.out.println(a+" is Even number");
        }else{
            System.out.println(a+" not a Even number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = sc.nextInt();
        
         methodWithOutStatic fe = new methodWithOutStatic();
        fe.findEven(a);
    } 
}
