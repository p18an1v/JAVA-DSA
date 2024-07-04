package Recurrsion;

public class lenghtOfString {
    
    static int Length(String str){

        if(str.length()==0){
            return 0;
        }
       return Length(str.substring(1))+1;
    }


    public static void main(String[] args) {
        
        String str ="asfa";
        System.out.println(Length(str));
        
    }
}
