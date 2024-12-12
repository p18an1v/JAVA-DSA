package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class missingAndRepeting {
    
    public static ArrayList<Integer> findMissAndRepeat(int arr[]){

        ArrayList<Integer> list = new ArrayList<>();

        Arrays.sort(arr);  //1 1 2 3 4 6

        //giving dublicate numbser
        for(int i = 0; i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                list.add(arr[i]);
            }

            if(arr[i]+1 != arr[i+1] && list.get(0)!=i+1){

                list.add(i+1);
            }


        }

        

        return list;
    }

    public static void main(String args[]){

        int arr[] = { 4, 3, 6, 2, 1, 1};
        System.out.println(findMissAndRepeat(arr));

    }
}
