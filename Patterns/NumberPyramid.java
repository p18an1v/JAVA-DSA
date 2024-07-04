
public class NumberPyramid {
    static void pyramit(int n){
        // rows
        for(int i = 1; i<= n; i++){
            //spaces
            for(int spaces =1 ; spaces<=n-i;spaces++){
                System.out.print(" ");
            }
           
            //stars
            for(int j =  1 ; j<=(2*i)-1; j++){
                    System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pyramit(5);
    }
}
