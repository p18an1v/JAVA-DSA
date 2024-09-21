package ArrayRev;

import Recurrsion.removeDuplicate;

public class ArrayFullRev {

    public static void print(int nums[]){

        for(int i = 0; i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }

    public static void insertBeg(int nums[],int val){

        int n = nums.length;
        int cnt = 0;
        for(int i= 0;i<nums.length;i++){
            if(nums[i]!=0){
                cnt++;
            }
        }

        if(cnt==n){
            System.out.println("Array is full");
            return;
        }else{

            for(int i = n-1;i>=1;i--){
                nums[i]=nums[i-1];
            }
            nums[0]=val;
            print(nums);
            return;
        }

    }

    public static void insertEnd(int nums[],int val){

        int n = nums.length;
        int cnt = 0;
        for(int i= 0;i<nums.length;i++){
            if(nums[i]!=0){
                cnt++;
            }
        }

        if(cnt==n){
            System.out.println("Array is full");
            return;
        }else{

            int j = 0;
            while(j<=nums.length-1){
                if(nums[j]!=0){
                    j++;
                }else{
                    break;
                }
            }
             nums[j] = val;
            print(nums);
            return;
        }

    }

    public static void insertAtpos(int nums[], int val,int pos){

        int n = nums.length;
        int cnt = 0;
        for(int i= 0;i<nums.length;i++){
            if(nums[i]!=0){
                cnt++;
            }
        }

        if(cnt==n){
            System.out.println("Array is full");
            return;
        }else{

            for(int i = n-1;i>=pos;i--){
                nums[i]=nums[i-1];
            }
            nums[pos-1]=val;
            print(nums);
            return;
        }

    }

    public static int deleteBeg(int nums[]){
        int data = nums[0];
        for(int i = 0;i<nums.length-1;i++){
            nums[i]= nums[i+1];
        }
        print(nums);
        return data;
    }

    public static void deleteEnd(int nums[]){
        
        int j = nums.length-1;
        while(j>=0){
            if(nums[j]==0){
                j--;
            }else{
                break;
            }
        }
         nums[j] = 0;
       // print(nums);
        return;
    }

    public static void deleteAtpos(int nums[],int pos){

        nums[pos-1] = 0;
        for(int i = pos-1;i<nums.length-1;i++){
            nums[i] = nums[i+1];
        }
        print(nums);
    }

    public static void bubbleSort(int nums[]){

        for(int i = 0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }

        print(nums);
    }

    public static void seletionSort(int nums[]){

        for(int i = 0;i<nums.length;i++){
            int minVal=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[minVal]>nums[j]){
                   minVal = j;
                }
            }
            int temp = nums[i];
            nums[i]=nums[minVal];
            nums[minVal]=temp;
        }
        print(nums);
    }
    

    public static void mergeSort(int nums[],int left,int right){

        if(left>=right){
            return;
        }

        int mid = left+(right-left)/2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid+1, right);
        merge(nums, left, mid,right);

    }

    public static void merge(int nums[], int start, int mid, int end) {
        int left = start;
        int right = mid + 1;
        int temp[] = new int[end - start + 1];
        int k = 0;
    
        // Merge the two halves into temp array
        while (left <= mid && right <= end) {
            if (nums[left] <= nums[right]) {
                temp[k++] = nums[left++];
            } else {
                temp[k++] = nums[right++];
            }
        }
    
        // Copy remaining elements from the left half, if any
        while (left <= mid) {
            temp[k++] = nums[left++];
        }
    
        // Copy remaining elements from the right half, if any
        while (right <= end) {
            temp[k++] = nums[right++];
        }
    
        // Copy the temp array back into the original array
        for (k = 0; k < temp.length; k++) {
            nums[start + k] = temp[k];
        }
    
        
    }

    public static void binarySearch(int nums[],int key){

        int  left = 0;
        int right = nums.length;

        while(left<=right){

            int mid = (left+right)/2;
            if(nums[mid]==key){
                System.out.println("Found at idx "+mid);
                return;
            }else if(nums[mid]<key){
                left = mid+1;
            }else{
                right =mid-1;
            }
        }

    }
    

    public static void main(String args[]){

        int nums[] = {2,3,4,5,6,0,0};
        int val = 4;
        //insertBeg(nums,val);
        //insertEnd(nums, val);
        //insertAtpos(nums, val, 5);
        //deleteBeg(nums);
        //deleteEnd(nums);
        //print(nums);
        //deleteAtpos(nums, 3);
        //bubbleSort(nums);
        //seletionSort(nums);
        //-----merge sort----------
        mergeSort(nums, 0, nums.length-1);
        print(nums);
        //-----merge sort----------
        binarySearch(nums, 3);
        
    }
}
