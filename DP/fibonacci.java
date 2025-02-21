package DP;
public class fibonacci {
    public static int calcFibo(int n, int dp[]) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        dp[n] = calcFibo(n - 1, dp) + calcFibo(n - 2, dp);
        return dp[n];
    }

    public static void main(String args[]) {
        int n = 6;
        int dp[] = new int[n + 1];  
        int result = calcFibo(n, dp);
        System.out.println("Fibonacci of " + n + " is: " + result);
    }
}
