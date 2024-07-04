package String;
import java.util.Scanner;
public class string {
    
    public static void main(String[] args) {
        
        String str = "Pranav";
        String str1 = new String(" Mhargude ");

       // Scanner sc = new Scanner(System.in);
       // String name = sc.nextLine();

        //In java Strings are Immutable 
        // altration in the string are done in new string not in old string

        //In java str.legth() it is a function not a property so u should add ();
        // in java arry have lenth property so u don;t have to use ()
        // space also count in the string as string
        System.out.println(str+str1);
       // System.out.println(str1.length());
       // System.out.println(name.length());

        //concatination is done with + sign
        // if u want to add two string u can use + sign

        //charAt() it is a function u can use this to print the any letter in the string
        System.out.println(str.charAt(0));

        for(int i = 0 ; i<= str.length()-1;i++ ){
            System.out.print(str.charAt(i)+" ");
        }
    }
}
