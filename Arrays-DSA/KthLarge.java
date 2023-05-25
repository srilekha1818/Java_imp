/*Q5. Given an integer array nums and an integer k, return the kth largest element in the array.
 Note that it is the kth largest element in the sorted order, not the kth distinct element.*/

import java.util.*;

public class KthLarge {

  public static int KthLargestElement(int arr[], int n, int k) {
    PriorityQueue<Integer> q = new PriorityQueue<Integer>(); // creating min-heap
    int i;
    for (i = 0; i < n; i++) {
      q.add(arr[i]); // push every element into the heap
      if (q.size() > k) q.remove(q.peek()); // if the size of the heap becomes greater than k, pop the element
    }
    return q.peek();
  }

  public static void main(String[] args) {
    int arr[] = { 2, 1, 4, 6, 3, 9, 7 };
    int n = arr.length;
    int k = 2;
    int x = KthLargestElement(arr, n, k);
    System.out.println("Kth largest element is " + x);
  }
}