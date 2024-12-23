package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RankTransformArray {

    public static void rank(int arr[]) {
        int newArr[] = new int[arr.length];
        int tempArr[] = arr.clone();

        Arrays.sort(arr);

        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int num : arr) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank++);
            }
        }

        for (int i = 0; i < tempArr.length; i++) {
            newArr[i] = rankMap.get(tempArr[i]);
        }

        for (int elm : newArr) {
            System.out.print(elm + " ");
        }
    }
    
    public static void main(String[] args) {
        
        int arr[] = {37,12,28,9,100,56,80,5,12};
       // 5,3,4,2,8,6,7,1,3
        rank(arr);

    }
}
