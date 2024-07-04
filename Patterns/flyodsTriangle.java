
public class flyodsTriangle {

    public static void patter(int n){
       int count = 1;
       for(int i=1;i<=n; i++){
         for(int j=1; j<=i ;j++){
             System.out.print(count);
             count++;
        }
        System.out.println();
    }
    }

    public static void main(String[] args) {
        int n = 5;
        patter(n);
    }
    
}
