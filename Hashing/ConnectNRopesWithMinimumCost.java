package Hashing;

import java.util.*;

public class ConnectNRopesWithMinimumCost {
    public static void findMinimumCost(int arr[], int N) {
        Arrays.sort(arr);
        int cost = 0;
        int prev = arr[0];
        int ans = 0;
        for (int i = 1; i < N; i++) {
            cost = prev + arr[i];
            prev = cost;
            ans = ans + prev;
        }
        System.out.print(ans);
    }

    public static void main(String args[]) {
        int arr[] = { 4, 3, 2, 6 };
        int N = 4;
        findMinimumCost(arr, N);
    }

}
