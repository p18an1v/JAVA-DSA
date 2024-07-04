package RecursionBasicQuestion;

public class LengthString {
    
    static int LegStr(String str){
        if(str.isEmpty()){
            return 0;
        }

        return 1+LegStr(str.substring(1));
    }

    public static void main(String[] args) {
        String str  = "dsfalhdfnaghd";
        System.out.println(LegStr(str));

    }
}
