package RecursionBasicQuestion;

public class pallindrom {

    static boolean check(String str){
    int i = 0;
    if(i >= str.length()%2){
        return false;
    }
     Boolean s = str.charAt(0+i) == str.charAt(str.length()-i);
     i++;
     return s;
    }
    

    public static void main(String[] args) {
        String str = "asdfa";
        System.out.println(check(str));
    }
}
