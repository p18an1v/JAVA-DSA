package RecursionBasicQuestion;

public class TowerOfHanio {
    
    static void diskInterchangeFunction(int n, String src, String helper,String destination){

        if(n==1){
            System.out.println("Transfer of disk "+ n + " from "+src+" to "+destination);
            return;
        }

        //transfer of disk n-1 from src to helper using destination as helper
        diskInterchangeFunction(n-1, src, destination, helper);
        //transfer of disk n-1 from helper to destination 
        diskInterchangeFunction(n-1,helper,src, destination);
    }

    public static void main(String[] args) {
        int n = 4;
        String a ="src";
        String b = "helper";
        String c = "dest";
        diskInterchangeFunction(n, a, b, c);
    }
}
