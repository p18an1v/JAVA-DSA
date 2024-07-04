package Recurrsion;

public class FriendsPair {
    
    static int solution(int n){ //3 

        //issue in this code...
        
        if(n==0 || n==1){
            return n;
        }

        //single 
        int single = solution(n-1); //2

        //pair
        int firstPair = solution(n-2); //1
        int reaminpairways = (n-1)*firstPair; //2

        int totalWays  = single + reaminpairways; //2+2 =4

        return totalWays; //4
    }

    public static void main(String[] args) {
        System.out.println(solution(3));
    }
}
