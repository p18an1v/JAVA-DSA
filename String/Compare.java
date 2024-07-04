package String;

public class Compare {
    
    public static void main(String[] args) {
        
        String s1 = "Pranav";
        String s2 = "Pranav";
        String s3 = new String("Pranav");

        if(s1==s2){
            System.out.println("Strings are equal ");
        }else{
            System.out.println("String are not equal ");
        }

        if(s1==s3){
            System.out.println("Strings are equal ");
        }else{
            System.out.println("String are not equal ");
        }

        if(s1.equals(s3)){ // returns boolean value
            System.out.println("Strings are equal ");
        }else{
            System.out.println("String are not equal ");
        }
    }
}
