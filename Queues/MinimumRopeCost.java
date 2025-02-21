package Queues;

import java.util.*;

public class MinimumRopeCost {

    static int printMinCost(int arr[], int len) {
        Queue<Integer> q = new PriorityQueue<>(); // Use a priority queue to keep elements sorted

        for (int i = 0; i < arr.length; i++) {
            q.add(arr[i]);
        }
        int res = 0;
        while (q.size() > 1) {
            int first = q.remove();
            int second = q.remove();
            int sum = first + second;
            res = res + sum;
            q.add(sum); // Add the sum back to the queue
        }
        return res;
    }

    public static void main(String args[]) {
        int arr[] = { 4, 3, 2, 6 };
        int len = 4;
        System.out.println("Minimum Cost " + printMinCost(arr, len));
    }
}
