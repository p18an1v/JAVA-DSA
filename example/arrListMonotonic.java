package example;
import java.util.ArrayList;

public class arrListMonotonic {

    static boolean isMonotonic(ArrayList<Integer> ls){
        boolean inc = true;
        boolean dec = true;
        for(int i = 0; i<ls.size()-1;i++){
            if(ls.get(i)>ls.get(i+1)){
                inc = false;
            }
            if(ls.get(i)<ls.get(i+1)){
                dec = false;
            }
        }

        if(inc == true || dec == true){
            System.out.println("Monotonic serires");
        }else{
            System.out.println("Not Monotonic");
        }

        return inc || dec;
    }
    

    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(2);
        ls.add(3);

        System.out.println(isMonotonic(ls));

    }
}
