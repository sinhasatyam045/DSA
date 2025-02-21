package Hashing;

import java.util.*;

public class DistinctElementsInEveryWindow {
    public static void printDistinctElements(int arr[], int n, int k) {
        HashSet<Integer> mp = new HashSet<>();
        for (int i = 0; i <= n - k; i++) {
            for (int j = i; j < i + k; j++) {
                mp.add(arr[j]);
            }
            System.out.print(mp.size() + " ");
            mp.clear();
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 1, 3, 4, 2, 3 };
        int n = arr.length;
        int k = 4;
        printDistinctElements(arr, n, k);

    }

}
