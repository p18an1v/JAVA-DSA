package LeetCode;

import example.bear;

public class checkMountainArr {
    

    public static boolean check(int arr[]){

        if(arr.length<3){
            return false;
        }

        int max = 0;        
        for(int i = 1;i<arr.length-1;i++){

            if(arr[i]==arr[i+1]){
                return false;
            }

            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                max++;
            }
        }

        if(max!=1){
            return false;
        }

        return true;
    }
    public static void main(String args[]){


        int arr[] = {0,3,2,1};
        System.out.println(check(arr));
    }
}
