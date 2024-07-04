package RecursionBasicQuestion;

public class fibonaci {
    
    public static int calSerires(int n){
        
        if(n == 0 || n == 1){
            return 1;
        }

        return calSerires(n-1)+calSerires(n-2);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(calSerires(n));

    }
}
