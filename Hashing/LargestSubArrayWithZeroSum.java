package Hashing;

import java.util.HashMap;

public class LargestSubArrayWithZeroSum {
    public static void printLongest(int arr[]) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int sum = 0;
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (mp.containsKey(sum)) {
                len = Math.max(len, i -mp.get(sum));
            } else {
                mp.put(sum, i);

            }

        }
        System.out.println(len);

    }

    public static void main(String args[]) {
        int arr[] = { 15, -2, 2, -8, 1, 7, 10 };
        printLongest(arr);

    }

}
