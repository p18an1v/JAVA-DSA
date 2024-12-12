package LeetCode;

class MedianOfTwoSorted{

    public static void creatNewSort(int n1,int n2, int arr1[], int arr2[]){

        int newArr[] = new int[n1+n2];
        int left = 0;
        int right = 0;
        int k = 0;
        while(left<=n1-1 && right<=n2-1){

            if(arr1[left]<arr2[right]){
                newArr[k++]= arr1[left++];

            }else{
                newArr[k++] = arr2[right++];
            }

        }

        while (left<=n1-1) {
            newArr[k++]= arr1[left++];
        }

        while (left<=n2-1) {
            newArr[k++]= arr2[left++];
        }

        //printing
        for(int i = 0; i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }

        meadian(newArr);

    }

    public static void meadian(int nums[]){
        int n = nums.length;

        if(n%2 == 0){
            int a = n/2;
            double m = (nums[a-1]+nums[a])/2.0;
            // System.out.println(a);
            // System.out.println(nums[a-1]);
            // System.out.println(nums[a]);
            System.out.println("Median is "+ m);
            System.out.println();
        }else{
            int a = n/2;
            System.out.print("Median is "+ nums[a]);
        }
    }


    public static void main(String args[]){
       int arr1[] = {2,4,6};
       int n1 = 3;
       int arr2[] = {1,3,5};
       int n2 = 3;

     // int n1 = 3, arr1[] = {2,4,6}, n2 = 2, arr2[] = {1,3};
        creatNewSort(n1, n2, arr1, arr2);
        
    }
}