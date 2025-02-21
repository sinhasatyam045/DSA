package Hashing;

import java.util.*;

public class KClosestElementsToGivenValue {
    public static void printElements(int arr[], int k, int X) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        int n = arr.length;
        int ind = findIndex(arr, n, X);
        int i = ind - 1;
        int j = ind;

        while (k > 0) {
            if (i >= 0 && j < n) {
                int diffI = Math.abs(arr[i] - X);
                int diffJ = Math.abs(arr[j] - X);

                if (diffI <= diffJ) {
                    pq.offer(arr[i--]);
                } else {
                    pq.offer(arr[j++]);
                }
            } else if (i >= 0) {
                pq.offer(arr[i--]);
            } else if (j < n) {
                pq.offer(arr[j++]);
            }

            k--;
        }

        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }

    public static int findIndex(int arr[], int n, int t) {
        int index = Arrays.binarySearch(arr, t);
        return (index < 0) ? -1 : index;
    }

    public static void main(String args[]) {
        int arr[] = { 12, 16, 22, 30, 35, 39, 42, 45, 48, 50, 53, 55, 56 };
        int X = 35;
        int k = 4;
        printElements(arr, k, X);
    }
}
