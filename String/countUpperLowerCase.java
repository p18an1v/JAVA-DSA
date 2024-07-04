package String;
import java.util.Scanner;

public class countUpperLowerCase {

    static int count(String str){

        int count = 0;
    
        for(int i = 0; i< str.length();i++ )
        {
            char ch = str.charAt(i);
            if( ch == 'a' || ch == 'e' || ch == 'i' || ch== 'o'||ch=='u'){
               count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();

        System.out.println(count(str));


    }
}
