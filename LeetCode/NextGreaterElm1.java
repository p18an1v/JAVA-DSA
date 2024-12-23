package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElm1 {

    public static void nextGreaterElement(int num1[], int num2[]) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int num : num2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }

        int newArr[] = new int[num1.length];
        for (int i = 0; i < num1.length; i++) {
            newArr[i] = map.getOrDefault(num1[i], -1);
        }

        for (int elm : newArr) {
            System.out.print(elm + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 2, 4};
        int[] nums2 = {6, 5, 4, 3, 2, 1, 7};
        nextGreaterElement(nums1, nums2);
    }
}
