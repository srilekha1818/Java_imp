/*Q6. Given an integer array nums and an integer k, return the kth smallest element in the array.
 Note that it is the kth smallest element in the sorted order, not the kth distinct element.*/

import java.util.*;

public class KthSmall{
    public static void main(String args[]) {
        //Initializing the nums, k, and n
        Integer nums[] = new Integer[] {9,6,1,12,56,5,4,2,5};
        int k = 4;
        int n = nums.length;

        //Building the max-heap
        PriorityQueue<Integer> mh = new PriorityQueue(Comparator.reverseOrder());
        mh.addAll(Arrays.asList(nums));

        //Iterating over remaining elements of nums
        for(int i=k;i<n;i++){
            if(nums[i]<mh.peek()){
                //pop the top and push nums[i] to the max-heap
                mh.poll();
                mh.add(nums[i]);
            }
        }

        System.out.println(k + "th smallest element is: " + mh.peek());
    }
}