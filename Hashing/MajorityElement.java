package Hashing;

import java.util.*;

public class MajorityElement {
    public static void printMajority(int arr[]) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (mp.containsKey(arr[i])) {
                int count = mp.get(arr[i]) + 1;
                mp.put(arr[i], count);
            } else {
                mp.put(arr[i], 1);
            }
            if (mp.get(arr[i]) > (arr.length) / 2) {
                System.out.println("Majority Element:" + arr[i]);
                return;
            }

        }
        System.out.println("No Majority element Found");
    }

    public static void main(String args[]) {
        int arr[] = { 3, 3, 4, 2, 4, 4, 2, 4, 4 };
        printMajority(arr);
    }

}
