package RecursionBasicQuestion;

public class factorail {
    
    static int calculateFactorail(int num){

        if(num==0){
            return 1;
        }

        int sum = num*calculateFactorail(num-1);

        return sum;

    }
    public static void main(String[] args) {
        int num = 5;
        System.out.println(calculateFactorail(num));

    }
}
