package Practice;

public class LongestSubsequenceCount {

    public static int findMaximum(int arr[], int k) {
        int n = arr.length;
        int dp[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            dp[i] = 1;  // Each element can form a subsequence of length 1
            
            for (int j = 0; j < i; j++) {
                if ((arr[i] - arr[j]) % k == 0) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        // Find the maximum value in dp[]
        int maxLen = 1;
        for (int i = 0; i < n; i++) {
            maxLen = Math.max(maxLen, dp[i]);
        }
        
        return maxLen;
    }

    public static void main(String args[]) {
        int arr[] = {2, 4, 6, 8};
        int k = 2;
        System.out.println(findMaximum(arr, k));  // Output should be 4
    }
}
