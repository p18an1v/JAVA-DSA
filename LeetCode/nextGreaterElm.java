package LeetCode;

import java.util.ArrayList;

import Basics.breakLoop;

public class nextGreaterElm {
    

    public static int[] solution(int nums1[], int nums2[]){

        int arr[] = new int[nums1.length];
        int k = 0;
        for(int i = 0;i<nums1.length;i++){

            int val = nums1[i];
            boolean found = false;

            for(int j = 0;j<nums2.length-1;j++){
                if(val==nums2[j] ){
                     if(val<nums2[j+1]){
                        arr[k++]=nums2[j+1];
                     }else{
                        arr[k++]=-1;
                     }
                     found=true;
                     break;
                }
               

            }
            if(!found){
                arr[k++] = -1;
            }
        }
        
        return arr;
    }

    public static void print(){
        int nums1[] = {4,1,2};
        int nums2[] = {1,3,4,2};
        int arr[]=solution(nums1, nums2).clone();

        for(int elm :arr){
            System.out.print(elm+" ");
        }
    }

    public static void main(String[] args) {

        print();
    }
}
