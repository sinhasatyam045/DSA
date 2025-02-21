package Practice;
import java.util.*;

public class LongestSubsequenceCountRecursion {
    public static ArrayList<Integer> list = new ArrayList<>();

    public static int findMaximum(int arr[], int k, int idx) {
        if (idx == arr.length) {
            return list.size();  // Base case: return the size of the current subsequence
        }

        int maxLen = 0;

        // Option 1: Take the current element if it satisfies the condition
        if (list.size() == 0 || (arr[idx] - list.get(list.size() - 1)) % k == 0) {
            list.add(arr[idx]);
            maxLen = Math.max(maxLen, findMaximum(arr, k, idx + 1));
            list.remove(list.size() - 1);  // Backtrack
        }

        // Option 2: Don't take the current element
        maxLen = Math.max(maxLen, findMaximum(arr, k, idx + 1));

        return maxLen;
    }

    public static void main(String args[]) {
        int arr[] = {2, 4, 6, 8};
        int k = 2;
        System.out.println(findMaximum(arr, k, 0));  // Output should be 4
    }
}
