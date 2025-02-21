package Hashing;

import java.util.*;

public class KthSmallestElement {
    public static int findKthSmallest(int arr[], int n, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < n; i++) {
            pq.offer(arr[i]);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();

    }

    public static void main(String args[]) {
        int arr[] = { 10, 4, 3, 7, 20, 15 };
        int k = 3;
        int n = arr.length;
        System.out.println(findKthSmallest(arr, n, k));
    }

}
