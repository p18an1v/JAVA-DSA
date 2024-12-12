import LinkList.swapLL;

public class QuickSort {

    public void Quick(int nums[], int low, int high) {
        if (low < high) {
            int partitionIdx = partitionFun(nums, low, high);
            Quick(nums, low, partitionIdx - 1); // Sort left part
            Quick(nums, partitionIdx + 1, high); // Sort right part
        }
    }

    public int partitionFun(int nums[], int low, int high) {
        int pivot = nums[low]; // Use the low position as the pivot
        int i = low;
        int j = high;

        while (i < j) {
            while (i <= high && nums[i] <= pivot) { 
                i++;
            }

            while (j >= low && nums[j] > pivot) { 
                j--;
            }

            if (i < j) {
                swap(nums, i, j);
            }
        }

        // Place pivot at its correct position
        swap(nums, low, j); 
        return j;
    }

    public void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void print(int nums[]) {
        for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k] + " ");
        }
    }

    public static void main(String[] args) {
        int nums[] = {4, 6, 2, 5, 7, 9, 1, 3};
        int i = 0;
        int j = nums.length - 1;
        QuickSort q = new QuickSort();
        q.Quick(nums, i, j); // Correct order of i, j
        q.print(nums);
    }
}
