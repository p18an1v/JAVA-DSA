package Recurrsion;

import Basics.reversNumber;

public class lastOccurence {
    
    static int search(int arr[],int key, int i){

        //base case
        if(i==arr.length){
            return -1;
        }

        //forward && self
        int isFound = search(arr, key, i+1);

        if(isFound == -1 && arr[i] == key){
            return i;
        }

        return isFound;
    } 
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int key = 5;
        System.out.println(search(arr, key, 0));
    }
}
