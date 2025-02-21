package Hashing;

import java.util.HashMap;

public class MaximumRepeatingNumber {
    public static void printMaximum(int arr[], int n) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!mp.containsKey(arr[i])) {
                mp.put(arr[i], 1);
            } else {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }
        }

        int max = 0;
        int result = 0;

        for (int key : mp.keySet()) {
            int curr = mp.get(key);
            if (curr > max) {
                max = curr;
                result = key;
            }
        }

        System.out.println("The maximum repeating number is: " + result);
        System.out.println("It repeats " + max + " times.");
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 3, 5, 3, 4, 1, 7 };
        int n = arr.length;
        printMaximum(arr, n);
    }
}
