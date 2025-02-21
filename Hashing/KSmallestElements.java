package Hashing;

import java.util.*;

public class KSmallestElements {
    public static void printKSmallest(int arr[], int n, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < n; i++) {
            pq.offer(arr[i]);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + " ");
            pq.poll();
        }

    }

    public static void main(String args[]) {
        int arr[] = { 1, 23, 12, 9, 30, 2, 50 };
        int n = arr.length;
        int k = 3;
        printKSmallest(arr, n, k);
    }

}
