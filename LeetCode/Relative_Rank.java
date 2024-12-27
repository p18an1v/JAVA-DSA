package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Relative_Rank {

    public static String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];
        int[] sortedScore = score.clone();
        Arrays.sort(sortedScore);

        Map<Integer, String> rankMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                rankMap.put(sortedScore[i], "Gold Medal");
            } else if (i == n - 2) {
                rankMap.put(sortedScore[i], "Silver Medal");
            } else if (i == n - 3) {
                rankMap.put(sortedScore[i], "Bronze Medal");
            } else {
                rankMap.put(sortedScore[i], String.valueOf(n - i));
            }
        }

        for (int i = 0; i < n; i++) {
            result[i] = rankMap.get(score[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int score[] = {10, 3, 8, 9, 4};
        String[] result = findRelativeRanks(score);
        for (String s : result) {
            System.out.println(s);
        }
    }
}
