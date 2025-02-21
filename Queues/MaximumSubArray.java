package Queues;

import java.util.*;

public class MaximumSubArray {
    static void printkSubArray(int arr[], int k, int n) {

        Deque<Integer> dq = new LinkedList<>();
        int i;
        for (i = 0; i < k; ++i) {
            while ((!dq.isEmpty()) && arr[i] >= arr[dq.peekLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }

        for (i = k; i < n; ++i) {
            System.out.print(arr[dq.peek()] + " ");
            while (!dq.isEmpty() && dq.peek() <= i - k) {
                dq.removeFirst();
            }
            while ((!dq.isEmpty()) && arr[i] >= arr[dq.peekLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);
            

        }
        System.out.print(arr[dq.peek()]);
    }

    public static void main(String args[]) {
        int arr[] = { 12, 1, 78, 90, 57, 89, 56 };
        int k = 3;
        int n = 7;
        printkSubArray(arr, k, n);
    }

}
