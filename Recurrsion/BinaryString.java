package Recurrsion;

public class BinaryString {
    
    static void string(int n,int lastPlace, String  str){

        if(n==0){
            System.out.println(str);
            return;
        }
        //kaam
       /*  if(lastPlace ==0){
            //sit zero on chair n
            string(n-1, 0, str.append("0"));
            string(n-1, 1, str.append("1"));
        }else{
            string(n-1, 0, str.append("0"));
        }
           */

        string(n-1, 0, str+"0");
        if(lastPlace==0){
             string(n-1, 1, str+"1");
        }
    }

    public static void main(String[] args) {
        string(3, 0, " ");
    }
}
