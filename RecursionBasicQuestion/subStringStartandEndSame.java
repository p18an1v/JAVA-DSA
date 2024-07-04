package RecursionBasicQuestion;

public class subStringStartandEndSame {

    static int startEndStr(String str, int i,int j, int n){
        //base 
        if(i==1){
            return 1;
        }

        if(n<=0){
            return 0;
        }

        int res = startEndStr(str, i+1, j, n) + startEndStr( str, i, j-1, n) - startEndStr(str, i+1, j-1, n-2);

        if(str.charAt(i) == str.charAt(j)){
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "abcab";
        int n = str.length();
        System.out.println(startEndStr(str, 0, n-1, n));
    }

}
