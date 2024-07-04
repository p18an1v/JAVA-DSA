package RecursionBasicQuestion;

public class addition {
    
    static int sumOfAll(int n){
        if(n==0){
            return 1;
        }


        return n+sumOfAll(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumOfAll(n));

    }
}
