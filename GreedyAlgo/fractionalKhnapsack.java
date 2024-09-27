package GreedyAlgo;

import java.util.Arrays;
import java.util.Comparator;

import RecursionBasicQuestion.sumOfDigit;

public class fractionalKhnapsack {
    
    public static void main(String args[]){
        int val[] = {60,100,120};
        int weight[] = {10,20,30};
        int w = 50;

        double ratio[][] = new double[val.length][2];
        //0th col => idx; 
        //1st col => ratio

        for(int i = 0; i<val.length;i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weight[i];
        }

        //asending order sorting
        Arrays.sort(ratio,  Comparator.comparingDouble(o->o[1]) );

        
        int capacity = w;
        int finalVal = 0;
        for(int i = ratio.length-1;i>=0;i--){
            int idx = (int)ratio[i][0];  
            if(capacity >= weight[idx] ){ //include full item
                finalVal +=val[idx]; 
                capacity-=weight[idx];
            }else{
                //include fraction item
                finalVal += (ratio[i][1]*capacity);
                capacity =0;
            }
        } 
        System.out.println("final value = " + finalVal); 
    }
    
}
