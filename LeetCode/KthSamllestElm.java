package LeetCode;

import java.util.PriorityQueue;

public class KthSamllestElm {
    

    public static int kthSamllest(int nums[],int size, int k){


        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> b-a);

        for(int i = 0; i<nums.length;i++){

            pq.offer(nums[i]);
            if(pq.size()>k){
                pq.poll();
            }
        }

        return pq.peek();
    }

    public static void main(String[] args) {
        
        int nums[] = {3,2,1,5,6,4};
        int k = 2;

        System.out.println("smallest : "+ kthSamllest(nums, nums.length, k));
    }
}
