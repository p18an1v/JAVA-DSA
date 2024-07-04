package DividAndConquer;

public class stringArrayMergeSort {

    static void sortFuntion(String arr[], int strIdx, int midIdx, int endIdx) {

        String temp[] = new String[endIdx - strIdx + 1];
        int i = strIdx;
        int j = midIdx + 1;
        int k = 0;

        while (i <= midIdx && j <= endIdx) {

            if (arr[i].charAt(0) < arr[j].charAt(0)) {
                temp[k] = arr[i];
                k++;
                i++;
            } else if (arr[i].charAt(0) == arr[j].charAt(0)) {
                if (arr[i].charAt(1) < arr[j].charAt(1)) {
                    temp[k] = arr[i];
                    k++;
                    i++;
                }
            } else {
                temp[k] = arr[j];
                k++;
                j++;
            }
        }

        // remaining left
        while (i <= midIdx) {
            temp[k] = arr[i];
            k++;
            i++;
        }

        // remaining right
        while (j <= endIdx) {
            temp[k] = arr[j];
            k++;
            j++;
        }

        // temp is copying to the original array
        for (k = 0, i = strIdx; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }

    static void sortArr(String arr[], int strIdx, int endIdx) {
        if (strIdx >= endIdx) {
            return;
        }

        // find midIdx
        int midIdx = strIdx + (endIdx - strIdx) / 2;
        // divid the array
        sortArr(arr, strIdx, midIdx); // Left
        sortArr(arr, midIdx + 1, endIdx); // Right
        // comparing function
        sortFuntion(arr, strIdx, midIdx, endIdx);
    }

    public static void main(String[] args) {
        String arr[] = { "sun", "earth", "mars", "mercury" };

        System.out.println("Before Merge Sort");
        for(int i = 0; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        System.out.println("After Merge Sort");
        sortArr(arr, 0,arr.length-1);
        for(int i = 0; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
