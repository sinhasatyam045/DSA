package DP;
import java.util.*;

public class MinCoin {
    public static int minCoin(int sum, int arr[]) {
        int dp[] = new int[sum + 1];
        Arrays.fill(dp, -1);
        return helper(sum, arr, dp);
    }

    public static int helper(int sum, int arr[], int[] dp) {
        if (sum == 0) return 0;
        if (dp[sum] != -1) return dp[sum];

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (sum - arr[i] >= 0) {
                int subAns = helper(sum - arr[i], arr, dp);
                if (subAns != Integer.MAX_VALUE && subAns + 1 < ans) {
                    ans = subAns + 1;
                }
            }
        }

        dp[sum] = ans;
        return dp[sum];
    }

    public static void main(String[] args) {
        int sum = 18;
        int arr[] = {7, 5, 1};
        int res = minCoin(sum, arr);
        System.out.println(res);  // Expected: 4 (5+5+7+1)
    }
}
