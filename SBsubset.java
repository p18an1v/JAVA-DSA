import Recurrsion.removeDuplicate;

public class SBsubset {
    
    static void subset(String str,String sb,int i){

        if(i == str.length()){
            if(sb.length() == 0){
                System.out.println("Null");
            }else{
                System.out.println(sb);
            }
            return;
        }

        

        //yes
        subset(str,sb+str.charAt(i), i+1);
        //no
        subset(str, sb, i+1);
    }

    public static void main(String[] args) {
        String str = "abc";
        String ans=" ";
        StringBuilder sb = new StringBuilder();
        subset(str, ans, 0);
    }
}
