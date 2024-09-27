package GreedyAlgo;

import java.util.Arrays;
import java.util.Comparator;

public class maxLengChain {
    
    public static void main(String[] args) {
        //O(nlogn) TC
        int pairs[][] = {{15,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(pairs, Comparator.comparingDouble(o->o[1]));

        int chainLen = 1;
        int chainEnd = pairs[0][1];//last selectd pair end //chain end

        for(int i = 0; i<pairs.length;i++){
            if(pairs[i][0] > chainEnd){
                chainLen++;
                chainEnd = pairs[i][1];
            }
        }

        System.out.println("Max length of chain = "+ chainLen);
    }
}
