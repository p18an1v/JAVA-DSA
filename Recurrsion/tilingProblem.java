package Recurrsion;
public class tilingProblem{

    public static int solution(int n){

        if(n==1||n==0){
            return 1;
        }

        int verticalTile = solution(n-1);
        int horizontalTile = solution(n-2);
        int totalWays = verticalTile + horizontalTile;

        return totalWays;
    }
    public static void main(String[] args) {
        
        int n=4;
        System.out.println(solution(n));

    }
}