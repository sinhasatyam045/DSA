package Greedy;

import java.util.Arrays;

public class LexicographicallySmallestArray {

    public static void main(String[] args) {
        int[] arr = {7, 6, 9, 2, 1};
        int k = 3;

        lexSmallestArray(arr, k);

        System.out.println("Lexicographically Smallest Array: " + Arrays.toString(arr));
    }

    static void lexSmallestArray(int[] arr, int k) {
        int n = arr.length;

        for (int i = 0; i < n - 1 && k > 0; i++) {
            // Find the minimum element in the remaining unprocessed part of the array
            int minIndex = i;
            for (int j = i + 1; j < n && j <= i + k; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the minimum element with its correct position
            for (int j = minIndex; j > i; j--) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }

            // Update the remaining swaps allowed
            k -= (minIndex - i);
        }
    }
}
