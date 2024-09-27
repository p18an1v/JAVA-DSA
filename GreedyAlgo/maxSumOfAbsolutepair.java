package GreedyAlgo;
import java.util.*;
public class maxSumOfAbsolutepair {
    
    public static void main(String[] args) {
        
        // int A[] = {1,2,3};
        // int B[] = {2,1,3};

        int A[] = {1,4,7,8};
        int B[] = {2,3,5,6};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;

        for(int i = 0;i<A.length;i++){
            minDiff += Math.abs(A[i]-B[i]);
        }

        System.out.println("Min absolute diffrence is "+minDiff);
    }
}
