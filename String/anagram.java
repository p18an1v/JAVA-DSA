package String;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String str1 = new String("earth");
        String str2 = new String("heart");

        //convert to lowercase to not check sepatetly for upper and lower case character
        String Lowstr1 = str1.toLowerCase();
        String Lowstr2 = str2.toLowerCase();

        //if length is equal of the both string 
        if(Lowstr1.length() == Lowstr2.length()){
            
            //convert into char and store into array
             char[] strArray1 = str1.toCharArray();
             char[] strArray2 = str2.toCharArray();

             //sort the array
             Arrays.sort(strArray1);
             Arrays.sort(strArray2);

             //check equality
             boolean result = Arrays.equals(strArray1, strArray2);
             if(result){
                System.out.println("Anagram of each other ");
             }else{
                System.out.println("Not an anagram of each other " );
             }
        }else{
            System.out.println("both string not anagram");
        }
    }
}
