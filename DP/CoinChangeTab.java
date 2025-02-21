package DP;

public class CoinChangeTab {
    public static int countWays(int coins[], int sum, int n) {
        int dp[][] = new int[n + 1][sum + 1];

        // Base case initialization:
        // 1 way to make sum 0, by selecting no coins
        for (int i = 0; i < n+1; i++) {
            dp[i][0] = 1;
        }

        // 0 ways to make any sum > 0 without any coins
        for (int i = 1; i < sum+1; i++) {
            dp[0][i] = 0;
        }

        // Fill the dp table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                // If current coin value is less than or equal to the current sum
                if (coins[i - 1] <= j) {
                    // Number of ways to make the current sum is:
                    // sum of ways using the current coin (without using it again)
                    // and ways without using the current coin
                    dp[i][j] = dp[i][j - coins[i - 1]] + dp[i - 1][j];
                } else {
                    // If current coin value is greater than current sum,
                    // ignore the current coin
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        // Return the number of ways to make the desired sum
        return dp[n][sum];
    }

    public static void main(String args[]) {
        int coins[] = {2, 5, 3, 6};
        int sum = 10;
        int n = coins.length;
        System.out.print(countWays(coins, sum, n));
    }
}
